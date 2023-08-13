package ru.job4j.calculator;

public class Calculator {

    private static int x = 5;

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static int minus(int number) {
        return x - number;
    }

    public int divide(int number) {
        return number / x;
    }

    public int sumAllOperation(int number) {
        return minus(number) + divide(number);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sumAllOperation(2));
    }
}
