package com.example;

public class App {

// addition
    public int add(int a, int b) {
        return a + b;
    }

// subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

// multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

// division
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        App calc = new App();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }

}
