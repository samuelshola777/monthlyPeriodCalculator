package com.example.monthlyPeriodCalculator.service;


import com.example.monthlyPeriodCalculator.dto.response.FollicullarCalculatorResponse;
import com.example.monthlyPeriodCalculator.dto.response.MenstrualDaysResponse;
import com.example.monthlyPeriodCalculator.exception.DateZException;
import com.example.monthlyPeriodCalculator.exception.MonthZException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

@Service
public class MonthlyCalculatorService {
    private LocalDateTime currentYear = LocalDateTime.now();

    public boolean containsAlphabet(String word){
        for (int i = 0; i < word.length(); i++) {
            if (Character.isAlphabetic(word.charAt(i))) return true;
        }
        return false;
    }

    public MenstrualDaysResponse menstrualDayCalculator(String startDate, String startMonth, String checkHowManyMonths) throws DateZException, MonthZException {
        int number = Integer.parseInt(checkHowManyMonths);

              int  startingDate = validationDate(startDate);
               Month startingMonth = Month.of(validationMonth(startMonth));
              int  presentYear = currentYear.getYear();
              februaryException(startingDate,startingMonth);
             LocalDate  eventDate = LocalDate.of(presentYear, startingMonth, startingDate);

                LocalDate nextOccurrence = eventDate.plusMonths(number);
           int     nextOccurrenceDate = nextOccurrence.getDayOfMonth();
           Month     nextOccurrenceMonth = nextOccurrence.getMonth();
            int    nextOccurrenceYear = nextOccurrence.getYear();

            int    endDate = eventDate.plusDays(5).getDayOfMonth();
            Month    endMonth = nextOccurrence.getMonth();
            int    endYear = eventDate.getYear();
        return new MenstrualDaysResponse(startingDate,
        startingMonth, presentYear, nextOccurrenceDate,
        nextOccurrenceMonth, nextOccurrenceYear, endDate,
        endMonth, endYear);
    }

    public FollicullarCalculatorResponse follicularCalculator(int startDate, int startMonthz, int checkHowManyMonths, int year) throws MonthZException, DateZException {
            LocalDate eventDate = LocalDate.of(year,  startMonthz, startDate);
           Month startMonth =  Month.of(startMonthz);

            LocalDate nextOccurance = eventDate.plusMonths(checkHowManyMonths);
            int nextOccuranceDate = nextOccurance.getDayOfMonth();
            Month nextOccuranceMonth = nextOccurance.getMonth();
            int nextOccuranceYear = nextOccurance.getYear();

            int endDate = eventDate.plusDays(7).getDayOfMonth();
            Month endMonth = nextOccurance.getMonth();
            int endYear = nextOccurance.getYear();
          return new FollicullarCalculatorResponse(startDate,startMonth,year,
                  nextOccuranceDate,nextOccuranceMonth,nextOccuranceYear,endDate,endMonth,endYear);
    }
    public void freePeriodCalculator(String startDate, String startMonth, String checkHowManyMonths) throws MonthZException, DateZException {
        int number = Integer.parseInt(checkHowManyMonths);
        for (int i = 0; i < number; i++) {
            int months = validationMonth(startMonth);
            int datezt = validationDate(startDate);

            int presentYear = currentYear.getYear();
            LocalDate eventDate = LocalDate.of(presentYear, months, datezt);
            LocalDate nextOccurance = eventDate.plusMonths(i);
            int nextOccuranceDate = nextOccurance.getDayOfMonth();
            Month nextOccuranceMonth = nextOccurance.getMonth();
            int nextOccuranceYear = nextOccurance.getYear();
            int endDate = eventDate.plusDays(4).getDayOfMonth();
            Month endMonth = nextOccurance.getMonth();
            int endYear = eventDate.plusMonths(months).getYear();

            System.out.printf("""
                    <<==================================>>
                    the start date is %d
                    the start month is %d
                                    
                    the next occurence date is %d
                    the next occurence month is %s
                    the next occurence year is %d
                                    
                    and it will end in %s
                    and it will end in  month %s
                    and it will end in  year %d
                                    
                    """, datezt, months, nextOccuranceDate, nextOccuranceMonth, nextOccuranceYear, endDate, endMonth, endYear);
        }
    }

    public int validationMonth(String months) throws DateZException, MonthZException {
        if (containsAlphabet(months)) throw new DateZException("invalid date input");
        int monthsz = Integer.parseInt(months) ;
        if (monthsz > 12 || monthsz < 0)throw new MonthZException("in valid month input");
            return monthsz;
    }
    public int validationDate(String date) throws DateZException, MonthZException {
        if (containsAlphabet(date)) throw new DateZException("invalid datezz input");
        int datezz = Integer.parseInt(date) ;
        if (datezz > 31 || datezz < 0)throw new MonthZException("in valid datezz input");
            return datezz;
    }
    public void  februaryException(int date, Month month) throws DateZException {
        if (month.equals(Month.FEBRUARY) || date > 28){
    throw new DateZException("invalid date, february is a 28 month");
        }
    }

    public static void main(String[] args) throws MonthZException, DateZException {
   MonthlyCalculatorService monthlyCircle = new MonthlyCalculatorService();

//        System.out.println(monthlyCircle.menstrualDayCalculator("2", "2", "1"));
        System.out.println(monthlyCircle.follicularCalculator(9, 12, 4, 2023));
//        monthlyCircle.freePeriodCalculator("9","12","4");

    }

}
