package com.example.monthlyPeriodCalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Month;
@AllArgsConstructor
@Data
public class OvulationCalculatorResponse {
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