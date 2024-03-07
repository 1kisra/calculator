package ru.krista.example;

import java.util.Scanner;

public class Calculator {

    private int number1, number2, result;
    private String operation;

    private int setNumber(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: " + number);
            System.exit(-1);
            return -1;
        }
    }

    public void calculate() {
        switch (operation) {
            case "+":
                result = sum();
                break;
            case "-":
                result = sub();
                break;
            case "*":
                result = mult();
                break;
            case "/":
                result = div();
                break;
            default:
                System.out.println("Не удалось определить знак из: " + operation);
                System.exit(-1);
        }
    }

    private int sum() {
        return number1+number2;
    }

    private int sub() {
        return number1-number2;
    }

    private int mult() {
        return number1*number2;
    }

    private int div() {
        if (number2 == 0) {
            System.out.println("Делитель не можеть быть 0");
            return -1;
        } else {
            return number1/number2;
        }  
    }

    public void inputExpression() {
        System.out.print("Введите выражение: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        String[] parts = str.split(" ");
        number1 = setNumber(parts[0]);
        number2 = setNumber(parts[2]);
        operation = parts[1];
    }
    
    public void printResult() {
        System.out.println("Результат: " + result);
    }

    public int getResult() {
        return result;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String sign) {
        this.operation = sign;
    }

    public void setNumber1(int num) {
        this.number1 = num;
    }

    public void setNumber2(int num) {
        this.number2 = num;
    }

}