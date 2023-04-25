package com.example.monthlyPeriodCalculator.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Month;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OvulationCalculatorResponse {
    @Id
    private long id;
    private int howManyMonth;
    private int OvulationStartDate;
    private Month OvulationStartMonth;
    private int OvulationStartYear;

    private int OvulationNextOccurrenceDate;
    private Month OvulationNextOccurrenceMonth;
    private int OvulationNextOccurrenceYear;

    private int OvulationEndDate;
    private Month OvulationEndMonth;
    private int OvulationEndYear;

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
                           
                           """, getOvulationStartDate(), getOvulationStartMonth()
                , getOvulationStartYear(), getOvulationNextOccurrenceDate(),
                getOvulationNextOccurrenceMonth(), getOvulationNextOccurrenceYear(),
                getOvulationEndDate(), getOvulationEndMonth(), getOvulationEndYear());

    }
}