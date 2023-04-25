package com.example.monthlyPeriodCalculator.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Month;
@Entity
@Data
@AllArgsConstructor
public class LutealCalculatorResponse {
    @Id
    private long id;
    private int lutealStartDate;
    private int lutealStartMonth;
    private int lutealStartYear;

    private int lutealNextOccurrenceDate;
    private Month lutealNextOccurrenceMonth;
    private int lutealNextOccurrenceYear;

    private int lutealEndDate;
    private Month lutealEndMonth;
    private int lutealEndYear;

    public LutealCalculatorResponse() {

    }

    public String toString() {
        return String.format("""
                         luteal start date: %d  
                         luteal start month: %s 
                        luteal start year: %d
                         
                        luteal nextOccurrenceDate : %d
                        luteal nextOccurrenceMonth : %s
                      luteal nextOccurrenceYear : %d
                         
                         luteal end date: %d
                       luteal end month: %s
                       luteal end year: %d
                         
                         """, lutealStartDate, lutealStartMonth,
                lutealStartYear, lutealNextOccurrenceDate,
                lutealNextOccurrenceMonth, lutealNextOccurrenceYear,
                lutealEndDate, lutealEndMonth, lutealEndYear);
    }
}