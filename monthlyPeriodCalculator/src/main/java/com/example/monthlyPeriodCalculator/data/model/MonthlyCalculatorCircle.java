package com.example.monthlyPeriodCalculator.data.model;

import com.example.monthlyPeriodCalculator.dto.response.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@AllArgsConstructor

@RequiredArgsConstructor
public class MonthlyCalculatorCircle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    @JsonIgnore
    @OneToOne
    private MenstrualDaysResponse menstrualPeriod;
    @JsonIgnore
    @OneToOne
    @NonNull
    private FollicullarCalculatorResponse follicularPeriod;
    @NonNull
    @JsonIgnore
    @OneToOne
    private OvulationCalculatorResponse ovulationPeriod;
    @JsonIgnore
    @OneToOne
    @NonNull
    private FreePeriodCalculatorResponse freePeriod;



    public MonthlyCalculatorCircle() {

    }
}
