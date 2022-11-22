package sk.ulohy.pyramida;

import java.util.Scanner;

public class Pyramida {

    private static Scanner scanner = new Scanner(System.in);
    private static int rows, col;

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println("How much rows should pyramid has?");
        rows = scanner.nextInt();

        col = rows + (rows - 1);

        for (int i = 0; i < rows; i++) {
            System.out.print("*");

            for (int j = 0; j < col-1; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}


/*
public class PrintTriangleMC {
    public static void main(String[] args) {
        int size = 10;
        int i = 0;

        while(i < size) {
            printChars(size - i - 1, ' ');
            printChars(2 * i + 1, '*');
            System.out.println();
            //printText(blablabla);  //--> cize to bude brat v tej dalsej funkcii ako hodnotu text - musim si to este skusit a upravit
            i++;
        }
    }

    private static final void printChars(int length, char c) { // toto je funkcia=metoda - vid nizsie
        for(int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}
 */
