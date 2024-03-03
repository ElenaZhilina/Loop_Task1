package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcVacationMonthTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/Data.csv")
    public void Examples(int expected, int income, int expenses, int threshold) {
        CalcVacationMonth service = new CalcVacationMonth();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}