package com.example.monthlyPeriodCalculator.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MonthlyCalculatorCircle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String menstrualDate;
    // falliculationdays 10 dayss
    private String falliculationDate;
    // ovulationDate  days2
    private String ovulationDate;
    // lutealDays 10 days
    private String lutealDate;
}
