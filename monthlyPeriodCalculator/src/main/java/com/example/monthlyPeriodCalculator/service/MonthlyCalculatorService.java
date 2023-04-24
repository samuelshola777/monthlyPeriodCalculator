package com.example.monthlyPeriodCalculator.service;


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

    public  void menstrualDayCalculator(String startDate, String startMonth, int checkHowManyMonths) throws DateZException, MonthZException {
        for (int i = 0; i < checkHowManyMonths; i++) {

            int months = validationMonth(startMonth);
            int datezt = validationDate(startDate);

            int presentYear = currentYear.getYear();
            LocalDate eventDate = LocalDate.of(presentYear, months, datezt);
            LocalDate nextOccurance = eventDate.plusMonths(i);
            int nextOccuranceDate = nextOccurance.getDayOfMonth();
            Month nextOccuranceMonth = nextOccurance.getMonth();
            int nextOccuranceYear = nextOccurance.getYear();
            int endDate = eventDate.plusDays(5).getDayOfMonth();
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

    public void falliculationDate(String startDate, String startMonth, int checkHowManyMonths) throws MonthZException, DateZException {
        for (int i = 0; i < checkHowManyMonths; i++) {
            int months = validationMonth(startMonth);
            int datezt = validationDate(startDate);

            int presentYear = currentYear.getYear();
            LocalDate eventDate = LocalDate.of(presentYear, months, datezt);
            LocalDate nextOccurance = eventDate.plusMonths(i);
            int nextOccuranceDate = nextOccurance.getDayOfMonth();
            Month nextOccuranceMonth = nextOccurance.getMonth();
            int nextOccuranceYear = nextOccurance.getYear();
            int endDate = eventDate.plusDays(5).getDayOfMonth();
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

    public static void main(String[] args) throws MonthZException, DateZException {
   MonthlyCalculatorService monthlyCircle = new MonthlyCalculatorService();

   monthlyCircle.menstrualDayCalculator("4","12",4);

    }

}
