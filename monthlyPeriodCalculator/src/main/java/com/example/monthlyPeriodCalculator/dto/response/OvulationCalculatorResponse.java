package com.example.monthlyPeriodCalculator.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.Month;
@Entity
@AllArgsConstructor

@Data
@RequiredArgsConstructor
public class OvulationCalculatorResponse {
    @Id
    private long id;
    @NonNull
    private int howManyMonth;
    @NonNull
    private int OvulationStartDate;
    @NonNull
    private Month OvulationStartMonth;
    @NonNull
    private int OvulationStartYear;
    @NonNull
    private int OvulationNextOccurrenceDate;
    @NonNull
    private Month OvulationNextOccurrenceMonth;
    @NonNull
    private int OvulationNextOccurrenceYear;
    @NonNull
    private int OvulationEndDate;
    @NonNull
    private Month OvulationEndMonth;
    @NonNull
    private int OvulationEndYear;

    public OvulationCalculatorResponse() {

    }

    public String toString() {
        return String.format("""
                        Ovulation start date: %d  
                        Ovulation start month: %s 
                        Ovulation start year: %d
                           
                        Ovulation nextOccurrenceDate : %d
                        Ovulation nextOccurrenceMonth : %s
                        Ovulation nextOccurrenceYear : %d
                           
                        Ovulation end date: %d
                        Ovulation end month: %s
                        Ovulation end year: %d
                           
           """, getOvulationStartDate(),
                getOvulationStartMonth()
                , getOvulationStartYear(),
                getOvulationNextOccurrenceDate(),
                getOvulationNextOccurrenceMonth(),
                getOvulationNextOccurrenceYear(),
                getOvulationEndDate(),
                getOvulationEndMonth(),
                getOvulationEndYear());

    }
}