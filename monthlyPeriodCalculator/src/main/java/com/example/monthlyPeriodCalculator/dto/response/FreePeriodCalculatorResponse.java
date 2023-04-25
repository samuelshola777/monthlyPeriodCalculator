package com.example.monthlyPeriodCalculator.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Month;
@Data
@Entity
@AllArgsConstructor
public class FreePeriodCalculatorResponse {
    @Id
    private long id;
    private int freePeriodStartDate;
    private int freePeriodStartMonth;
    private int freePeriodStartYear;

    private int freePeriodNextOccurrenceDate;
    private Month freePeriodNextOccurrenceMonth;
    private int freePeriodNextOccurrenceYear;

    private int freePeriodEndDate;
    private Month freePeriodEndMonth;
    private int freePeriodEndYear;

    public FreePeriodCalculatorResponse() {

    }

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