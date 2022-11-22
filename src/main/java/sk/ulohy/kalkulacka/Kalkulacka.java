package sk.ulohy.kalkulacka;

import java.math.BigDecimal;
import java.util.Scanner;

public class Kalkulacka {

    private static Scanner scanner = new Scanner(System.in);
    private static String numOperation, option;
    private static double num1, num2;

    private static double result;

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        try {
            do {
                System.out.println("Write number and click enter\n then choose operation you want to execute (+, -, * or /), click enter \n and write another number \n or press X for EXIT: ");
                num1 = scanner.nextDouble();

                Scanner numOperation = new Scanner(System.in);
                option = numOperation.nextLine().toUpperCase();

                num2 = scanner.nextDouble();


                switch (option) {
                    case "+":
                        result = num1 + num2;
                        System.out.println("Result of addition (" + option + ") of numbers is " + result);
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;
                    case "-":
                        result = num1 - num2;
                        System.out.println("Result of subtraction (" + option + ") of numbers is " + result);
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;
                    case "*":
                        result = num1 * num2;
                        System.out.println("Result of multiplication (" + option + ") of numbers is " + result);
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        break;
                    case "/":
                        result = num1 / num2;
                        System.out.println("Result of division (" + option + ") of numbers is " + result);
                        System.out.println(num1 + " / " + num2 + " = " + result);
                        break;
                }

            } while (!"X".equals(option) || "x".equals(option));
            System.out.println("End");
            System.exit(0);

        } catch (Exception e) {
            System.out.println("Something wrong!");

        }
    }
}


