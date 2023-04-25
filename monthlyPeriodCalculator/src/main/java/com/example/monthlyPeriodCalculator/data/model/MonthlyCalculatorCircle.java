package com.example.monthlyPeriodCalculator.data.model;

import com.example.monthlyPeriodCalculator.dto.response.*;
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
    @OneToOne
    private FollicullarCalculatorResponse follicularPeriod;
    @OneToOne
    private FreePeriodCalculatorResponse freePeriod;
    @OneToOne
    private LutealCalculatorResponse lutealPeriod;
    @OneToOne
    private MenstrualDaysResponse menstrualPeriod;
    @OneToOne
    private OvulationCalculatorResponse ovulationPeriod;

}
