package com.example.monthlyPeriodCalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Month;
@Data
@AllArgsConstructor
public class LutealCalculatorResponse {
    private int lutealStartDate;
    private Month lutealStartMonth;
    private int lutealStartYear;

    private int lutealNextOccurrenceDate;
    private Month lutealNextOccurrenceMonth;
    private int lutealNextOccurrenceYear;

    private int lutealEndDate;
    private Month lutealEndMonth;
    private int lutealEndYear;
}
