package com.example.monthlyPeriodCalculator.data.model;

import com.example.monthlyPeriodCalculator.dto.response.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import jakarta.persistence.*;
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
    @JsonIgnore
    @OneToOne
    private FollicullarCalculatorResponse follicularPeriod;
    @JsonIgnore
    @OneToOne
    private FreePeriodCalculatorResponse freePeriod;
    @JsonIgnore
    @OneToOne
    private LutealCalculatorResponse lutealPeriod;
    @JsonIgnore
    @OneToOne
    private MenstrualDaysResponse menstrualPeriod;
    @JsonIgnore
    @OneToOne
    private OvulationCalculatorResponse ovulationPeriod;

}
