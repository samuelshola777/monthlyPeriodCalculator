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
            Menstrual period End year : %d
    <<--------------------------------------->>
            Follicular period Start date : %d
            Follicular period Start month : %s
            Follicular period Start year : %d
            
            Follicular period Next occurrence date  : %d
            Follicular period Next occurrence month : %s
            Follicular period Next occurrence year  : %d
            
            Follicular period End Date : %d
            Follicular period End Month : %s
            Follicular period End Year : %d
            <<--------------------------------------------->>
            Ovulation period start date : %d
            Ovulation period start Month : %s
            Ovulation period start Year : %d
            
            Ovulation period Next occurrence Date : %d
            Ovulation period Next occurrence Month : %s
            Ovulation period Next occurrence Year : %d
            
            Ovulation period End date : %d
            Ovulation period End Month : %s
            Ovulation period End Year : %d
            
            
    """,menstrualPeriod.getMenstrualStartDate()
       ,menstrualPeriod.getMenstrualStartMonth()
        ,menstrualPeriod.getMenstrualStartYear(),

    menstrualPeriod.getMenstrualNextOccurrenceDate(),
    menstrualPeriod.getMenstrualNextOccurrenceMonth(),
    menstrualPeriod.getMenstrualNextOccurrenceYear(),

    menstrualPeriod.getMenstrualEndDate(),
    menstrualPeriod.getMenstrualEndMonth(),
    menstrualPeriod.getMenstrualEndYear(),

    follicularPeriod.getFollicullarStartDate(),
    follicularPeriod.getFollicullarstartMonth(),
    follicularPeriod.getFollicullarStartYear(),

    follicularPeriod.getFollicullarNextOccurrenceDate()
    ,follicularPeriod.getFollicullarNextOccurrenceMonth(),
     follicularPeriod.getFollicullarNextOccurrenceYear(),

     follicularPeriod.getFollicullarEndDate(),
     follicularPeriod.getFollicullarEndMonth(),
     follicularPeriod.getFollicullarEndYear(),

    ovulationPeriod.getOvulationStartDate(),
    ovulationPeriod.getOvulationStartMonth(),
    ovulationPeriod.getOvulationStartYear(),

    ovulationPeriod.getOvulationNextOccurrenceDate(),
    ovulationPeriod.getOvulationNextOccurrenceMonth(),
    ovulationPeriod.getOvulationNextOccurrenceYear(),

    ovulationPeriod.getOvulationEndDate(),
    ovulationPeriod.getOvulationEndMonth(),
    ovulationPeriod.getOvulationEndYear());
   }

    public MonthlyCalculatorCircle() {

    }

}
