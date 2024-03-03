package ru.netology;

public class Main {
    public static void main(String[] args) {
        CalcVacationMonth service = new CalcVacationMonth();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int actual = service.calculate(income, expenses, threshold);
    }

}