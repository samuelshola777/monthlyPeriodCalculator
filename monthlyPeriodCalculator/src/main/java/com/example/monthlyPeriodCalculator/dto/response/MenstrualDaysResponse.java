package com.example.monthlyPeriodCalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Month;

@AllArgsConstructor
@Data
public class MenstrualDaysResponse {

    private int startDate;
    private Month startMonth;
    private int startYear;

    private int nextOccurrenceDate;
    private Month nextOccurrenceMonth;
    private int nextOccurrenceYear;

    private int endDate;
    private Month endMonth;
    private int endYear;

public String toString(){
    return String.format("""
            start date: %d  
            start month: %s 
            start year: %d
            
            nextOccurrenceDate : %d
            nextOccurrenceMonth : %s
            nextOccurrenceYear : %d
            
            end date: %d
            end month: %s
            end year: %d
            
            """,startDate,startMonth,startYear,
   nextOccurrenceDate,nextOccurrenceMonth,nextOccurrenceYear,
            endDate,endMonth,endYear);
}

}
