package com.example.monthlyPeriodCalculator.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.Month;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class FreePeriodCalculatorResponse {
    @Id
    private long id;
@NonNull
    private int freePeriodStartDate;
    @NonNull
    private Month freePeriodStartMonth;
    @NonNull
    private int freePeriodStartYear;
    @NonNull
    private int freePeriodNextOccurrenceDate;
    @NonNull
    private Month freePeriodNextOccurrenceMonth;
    @NonNull
    private int freePeriodNextOccurrenceYear;
    @NonNull
    private int freePeriodEndDate;
    @NonNull
    private Month freePeriodEndMonth;
    @NonNull
    private int freePeriodEndYear;

    private int howManyMonth;

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
                           
            """, freePeriodStartDate,
                freePeriodStartMonth,
                freePeriodStartYear,

                freePeriodNextOccurrenceDate,
                freePeriodNextOccurrenceMonth,
                freePeriodNextOccurrenceYear,

                freePeriodEndDate,
                freePeriodEndMonth,
                freePeriodEndYear);
    }
}