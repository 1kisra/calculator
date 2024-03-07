package ru.krista.example;

public final class App {

    public static void main(String[] args) {

        System.out.println("*Калькулятор*");
        Calculator calculator = new Calculator();
        
        calculator.inputExpression();
        calculator.calculate();
        calculator.printResult();

        

    }

}
