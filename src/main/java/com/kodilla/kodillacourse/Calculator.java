package com.kodilla.kodillacourse;

public class Calculator {
    public int addTwoDigits(int a, int b){
        return a+b;
    }

    public int subtractTwoDigits(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.addTwoDigits(1,4));
        System.out.println(calc.subtractTwoDigits(10,7));

    }
}
