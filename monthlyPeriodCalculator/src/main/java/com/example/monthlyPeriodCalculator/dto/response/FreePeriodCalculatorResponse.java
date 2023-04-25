package com.example.monthlyPeriodCalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Month;
@Data
@AllArgsConstructor
public class FreePeriodCalculatorResponse {
    private int freePeriodStartDate;
    private int freePeriodStartMonth;
    private int freePeriodStartYear;

    private int freePeriodNextOccurrenceDate;
    private Month freePeriodNextOccurrenceMonth;
    private int freePeriodNextOccurrenceYear;

    private int freePeriodEndDate;
    private Month freePeriodEndMonth;
    private int freePeriodEndYear;

    public String toString() {
        return String.format("""
                           free period start date: %d  
                           free period  start month: %s 
                           free period  start year: %d
                           
                           free period  nextOccurrenceDate : %d
                          free period  nextOccurrenceMonth : %s
                         free period  nextOccurrenceYear : %d
                           
                         free period  end date: %d
                         free period  end month: %s
                        free period  end year: %d
                           
                           """, freePeriodStartDate, freePeriodStartMonth,
                freePeriodStartYear, freePeriodNextOccurrenceDate,
                freePeriodNextOccurrenceMonth, freePeriodNextOccurrenceYear,
                freePeriodEndDate, freePeriodEndMonth, freePeriodEndYear);
    }
}