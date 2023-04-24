package com.example.monthlyPeriodCalculator.exception;

public class DateZException extends Exception{
    String message;

    public DateZException(String message) {
        super(message);
    }
}
