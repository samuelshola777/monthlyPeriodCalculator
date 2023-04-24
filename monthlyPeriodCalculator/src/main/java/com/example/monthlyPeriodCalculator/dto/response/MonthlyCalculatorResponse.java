package com.example.monthlyPeriodCalculator.dto.response;

import lombok.Data;

@Data
public class MonthlyCalculatorResponse {
    private String menstrualDate;
    // falliculationdays 10 dayss
    private String falliculationDate;
    // ovulationDate  days2
    private String ovulationDate;
    // lutealDays 10 days
    private String lutealDate;
}
