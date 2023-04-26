package com.example.monthlyPeriodCalculator.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.Month;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@RequiredArgsConstructor
public class MenstrualDaysResponse {
    @Id
    private long id;
@NonNull
    private int menstrualStartDate;
    @NonNull
    private String menstrualStartMonth;
    @NonNull
    private int menstrualStartYear;
    @NonNull

    private int menstrualNextOccurrenceDate;
    @NonNull
    private Month menstrualNextOccurrenceMonth;
    @NonNull
    private int menstrualNextOccurrenceYear;
    @NonNull
    private int menstrualEndDate;
    @NonNull
    private Month menstrualEndMonth;
    @NonNull
    private int menstrualEndYear;
    @NonNull
    private int howManyMonth;

//    public MenstrualDaysResponse(int startingDate, Month startingMonth, int presentYear, int nextOccurrenceDate, Month nextOccurrenceMonth, int nextOccurrenceYear, int endDate, Month endMonth, int endYear) {
//    }

//    public MenstrualDaysResponse(int startingDate, Month startingMonth, int presentYear, int nextOccurrenceDate, Month nextOccurrenceMonth, int nextOccurrenceYear, int endDate, Month endMonth, int endYear, int number) {
//    }

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
