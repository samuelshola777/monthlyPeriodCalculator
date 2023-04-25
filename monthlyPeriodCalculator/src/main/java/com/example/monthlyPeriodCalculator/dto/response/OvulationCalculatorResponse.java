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
}
