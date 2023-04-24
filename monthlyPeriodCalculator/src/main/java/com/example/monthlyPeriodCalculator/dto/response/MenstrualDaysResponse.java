package com.example.monthlyPeriodCalculator.dto.response;

import lombok.Data;

@Data
public class MenstrualDaysResponse {

    private int startDate;
    private int startMonth;
    private int startYear;

    private int endDate;
    private int endMonth;
    private int endYear;

    private int nextOccurrenceDate;
    private int nextOccurrenceMonth;
    private int nextOccurrenceYear;

}
