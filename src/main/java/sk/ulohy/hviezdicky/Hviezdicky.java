package sk.ulohy.hviezdicky;

import java.util.Scanner;

public class Hviezdicky {

    static int rows;
    static int col;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String decision;
//        do {
//            System.out.println("Do you want to print stars? [click C to continue or X to exit]");
//            decision = scanner.nextLine().toUpperCase();
//            if (decision != "C") {
//                System.out.println("Choose again!");
//
//            } else {
//                amountOfStars();
//                writeOutStars();
//            }
//
//        } while (decision != "X");

        System.out.println("Do you want to print stars? [click C to continue or X to exit]");
        decision = scanner.nextLine().toUpperCase();

        if ("C".equals(decision)) {
            amountOfStars();
            writeOutStars();
        } else if ("X".equals(decision)) {
            System.exit(0);
        } else {
            System.out.println("Choose again!");
        }

    }



    private static void writeOutStars() {
        System.out.println("Figure: ");

        for (int i = 0; i < rows; i++){
            System.out.print(" * ");

            for (int j = 0; j < col-1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void amountOfStars() {

        System.out.println("Enter number of stars in column: ");
        rows = scanner.nextInt();

        System.out.println("Enter number of stars in row: ");
        col = scanner.nextInt();

        System.out.println("Number of rows: " + rows + "\nNumber of columns: " + col + "\n");
    }
}
