package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("  CI/CD Pipeline Demo Application");
        System.out.println("  Build Timestamp: " + System.currentTimeMillis());
        System.out.println("=====================================");
        
        Calculator calc = new Calculator();
        
        // Perform some calculations
        int sum = calc.add(15, 25);
        int difference = calc.subtract(50, 12);
        int product = calc.multiply(7, 8);
        
        System.out.println("15 + 25 = " + sum);
        System.out.println("50 - 12 = " + difference);
        System.out.println("7 * 8 = " + product);
        
        System.out.println("=====================================");
        System.out.println("  Application started successfully!");
        System.out.println("=====================================");
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
}
