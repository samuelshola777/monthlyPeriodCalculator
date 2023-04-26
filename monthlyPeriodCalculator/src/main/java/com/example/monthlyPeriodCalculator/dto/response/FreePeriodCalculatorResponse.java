package com.example.monthlyPeriodCalculator.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Month;
@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
public class FreePeriodCalculatorResponse {
    @Id
    private long id;

    private int freePeriodStartDate;
    private Month freePeriodStartMonth;
    private int freePeriodStartYear;

    private int freePeriodNextOccurrenceDate;
    private Month freePeriodNextOccurrenceMonth;
    private int freePeriodNextOccurrenceYear;

    private int freePeriodEndDate;
    private Month freePeriodEndMonth;
    private int freePeriodEndYear;
    private int howManyMonth;

    public FreePeriodCalculatorResponse(int startDate,Month startMonthz, int year, int nextOccuranceDate, Month nextOccuranceMonth, int nextOccuranceYear, int endDate, Month endMonth, int endYear) {
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