package com.example.monthlyPeriodCalculator.service;


import com.example.monthlyPeriodCalculator.data.model.MonthlyCalculatorCircle;
import com.example.monthlyPeriodCalculator.dto.response.*;
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
              int validated = validationMonth(startMonth);
//               Month startingMonth = Month.of(validated);
              int  presentYear = currentYear.getYear();
//              februaryException(startingDate,startingMonth);
             LocalDate  eventDate = LocalDate.of(presentYear, validated, startingDate);

                LocalDate nextOccurrence = eventDate.plusMonths(number);
           int     nextOccurrenceDate = nextOccurrence.getDayOfMonth();
           Month     nextOccurrenceMonth = nextOccurrence.getMonth();
            int    nextOccurrenceYear = nextOccurrence.getYear();

            int    endDate = eventDate.plusDays(5).getDayOfMonth();
            Month    endMonth = nextOccurrence.getMonth();
            int    endYear = eventDate.getYear();
            String startMonthA = String.valueOf(validated);
        return new MenstrualDaysResponse(startingDate,
        startMonthA, presentYear, nextOccurrenceDate,
        nextOccurrenceMonth, nextOccurrenceYear, endDate,
        endMonth, endYear,number);

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
          return new FollicullarCalculatorResponse(startDate,startMonthz,year,
                  nextOccuranceDate,nextOccuranceMonth,nextOccuranceYear,endDate,endMonth,endYear,checkHowManyMonths);

    }
    public OvulationCalculatorResponse ovulationCalculator(int startDate, int startMonth
            , int checkHowManyMonths, int year) throws MonthZException, DateZException {


            LocalDate eventDate = LocalDate.of(year, startMonth, startDate);
            LocalDate nextOccurance = eventDate.plusMonths(checkHowManyMonths);

            int nextOccuranceDate = nextOccurance.getDayOfMonth();
            Month nextOccuranceMonth = nextOccurance.getMonth();
            int nextOccuranceYear = nextOccurance.getYear();

            int endDate = eventDate.plusDays(4).getDayOfMonth();
            Month endMonth = nextOccurance.getMonth();
            int endYear = nextOccurance.getYear();

return new OvulationCalculatorResponse(checkHowManyMonths,startDate,startMonth,year,nextOccuranceDate,nextOccuranceMonth,nextOccuranceYear,endDate,endMonth,endYear);
    }
    public FreePeriodCalculatorResponse freePeriodicCalculator(int startDate, int startMonthz, int checkHowManyMonths, int year){
        LocalDate eventDate = LocalDate.of(year, startMonthz, startDate);
        LocalDate nextOccurance = eventDate.plusMonths(checkHowManyMonths);

        int nextOccuranceDate = nextOccurance.getDayOfMonth();
        Month nextOccuranceMonth = nextOccurance.getMonth();
        int nextOccuranceYear = nextOccurance.getYear();

        int endDate = eventDate.plusDays(3).getDayOfMonth();
        Month endMonth = nextOccurance.getMonth();
        int endYear = nextOccurance.getYear();

        return new FreePeriodCalculatorResponse(startDate,startMonthz
                ,year,nextOccuranceDate,nextOccuranceMonth
                ,nextOccuranceYear,endDate,endMonth,endYear);
    }

    public MonthlyCalculatorCircle monthlyCalculatorCircle(String startDate, String startMonth, String checkHowManyMonths) throws MonthZException, DateZException {

        MenstrualDaysResponse menstrualDays = menstrualDayCalculator(startDate,startMonth,checkHowManyMonths);
        FollicullarCalculatorResponse follicullar = follicularCalculator(menstrualDays.getMenstrualStartDate(),
                Integer.parseInt(menstrualDays.getMenstrualStartMonth()),menstrualDays.getMenstrualStartYear(),menstrualDays.getHowManyMonth());
        OvulationCalculatorResponse ovulation = ovulationCalculator(follicullar.getFollicullarStartDate(), follicullar.getFollicullarstartMonth(), follicullar.getFollicullarStartYear(), follicullar.getHowManyMonth());
        FreePeriodCalculatorResponse freePeriod = freePeriodicCalculator(ovulation.getOvulationStartDate(),ovulation.getOvulationStartMonth(),ovulation.getOvulationStartYear(),ovulation.getHowManyMonth());
    return new MonthlyCalculatorCircle(menstrualDays,follicullar,ovulation,freePeriod);
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

   //     System.out.println(monthlyCircle.menstrualDayCalculator("2", "2", "1"));
//        System.out.println(monthlyCircle.follicularCalculator(9, 12, 1, 2023));
//        System.out.println(monthlyCircle.luteCalculator(9, 12, 1, 2023));
        System.out.println(monthlyCircle.monthlyCalculatorCircle("16","8","1"));
    }

}
