package sk.ulohy.pyramida;

import java.util.Scanner;

public class Pyramida {

    private static Scanner scanner = new Scanner(System.in);
    private static int rows;

    public static void main(String[] args) {

        System.out.println("How much rows should pyramid has?");
        rows = scanner.nextInt();
        int i = 0;

        while (i < rows) {
            printSpace(rows - i -1);
            printStar(2 * i +1);
            System.out.println();
            i++;
        }
    }

    private static void printSpace(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print('-');
        }
    }
    private static void printStar(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print('*');
        }
    }

}
 /*
 System.out.println("How much rows should pyramid has?");
        rows = scanner.nextInt();
        int i = 0;

        while (i < rows) {
            printChar(rows - i -1, '-');
            printChar(2 * i +1, '*');
            System.out.println();
            i++;
        }
    }

    private static void printChar(int length, char c) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }

  */
