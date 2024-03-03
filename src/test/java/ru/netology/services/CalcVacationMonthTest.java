package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CalcVacationMonthTest {
    @Test
    public void Example1() {
        CalcVacationMonth service = new CalcVacationMonth();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void Example2() {
        CalcVacationMonth service = new CalcVacationMonth();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}