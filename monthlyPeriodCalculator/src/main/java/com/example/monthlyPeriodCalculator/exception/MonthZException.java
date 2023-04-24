package com.example.monthlyPeriodCalculator.exception;

public class MonthZException  extends Exception{
    String message;

    public MonthZException(String message){
        super(message);
    }
}
