package ru.krista.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {

    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        
        String[] parts;
        int a = 0;
        int b = 0;
        

        System.out.print("Введите выражение: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();            
        in.close();
        parts = str.split(" ");

        try {
            a = Integer.parseInt(parts[0]);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: " + parts[0]);
        }

        try {
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: " + parts[2]);
        }

        System.out.print("Результат: ");

        switch (parts[1]) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Делитель не можеть быть 0");
                    return;
                } else {
                    System.out.println(a/b);
                    break;
                }
            default:
                System.out.println("Не удалось определить знак из: " + parts[1]);
                break;
        }

    }

}
