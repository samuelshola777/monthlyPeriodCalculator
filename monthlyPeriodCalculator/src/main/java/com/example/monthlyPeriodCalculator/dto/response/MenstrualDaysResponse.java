package com.example.monthlyPeriodCalculator.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Month;
@Entity
@AllArgsConstructor
@Data
public class MenstrualDaysResponse {
    @Id
    private long id;

    private int menstrualStartDate;
    private Month menstrualStartMonth;
    private int menstrualStartYear;

    private int menstrualNextOccurrenceDate;
    private Month menstrualNextOccurrenceMonth;
    private int menstrualNextOccurrenceYear;

    private int menstrualEndDate;
    private Month menstrualEndMonth;
    private int menstrualEndYear;

public String toString(){
    return String.format("""
            menstrual start date: %d  
            menstrual start month: %s 
            menstrual start year: %d
            
            menstrual nextOccurrenceDate : %d
            menstrual nextOccurrenceMonth : %s
            menstrual nextOccurrenceYear : %d
            
            menstrual end date: %d
            menstrual end month: %s
            menstrual end year: %d
            
            """,menstrualStartDate,menstrualStartMonth,menstrualStartYear,
            menstrualNextOccurrenceDate,menstrualNextOccurrenceMonth,menstrualNextOccurrenceYear,
            menstrualEndDate,menstrualEndMonth,menstrualEndYear);
}

}
