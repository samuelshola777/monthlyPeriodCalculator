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


   public String toString() {
    return String.format("""
            Menstrual period Start date : %d
            Menstrual period start month : %s
            Menstrual period start end  : %d
            Menstrual period next Occurrence date : %d
            Menstrual period next occurrence month : %s
            Menstrual period next occurrence year : %d
            Menstrual period End date : %d
            Menstrual period End Month : %s
            Menstrual period End year : %s
    <<--------------------------------------->>
            
    """,menstrualPeriod.getMenstrualStartDate()
       ,menstrualPeriod.getMenstrualStartMonth()
        ,menstrualPeriod.getMenstrualStartYear(),
    menstrualPeriod.getMenstrualNextOccurrenceDate(),
    menstrualPeriod.getMenstrualNextOccurrenceMonth(),
    menstrualPeriod.getMenstrualNextOccurrenceYear(),
    menstrualPeriod.getMenstrualEndDate(),
    menstrualPeriod.getMenstrualEndMonth(),
    menstrualPeriod.getMenstrualEndYear());
   }

    public MonthlyCalculatorCircle() {

    }

}
