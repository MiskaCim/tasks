package sk.ulohy.hviezdicky;

import java.util.Scanner;

public class Hviezdicky {

    static int rows;
    static int col;
    static String decision;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        try {
            System.out.println("Do you want to print stars? [click C to continue or X to exit]");
            decision = scanner.nextLine().toUpperCase();

            if ("C".equals(decision)) {
                stars();
            } else if ("X".equals(decision)) {
                System.exit(0);
            } else {
                System.out.println("Choose again!");
                run();
            }

        } catch (Exception e) {
            System.out.println("Something wrong!");
        }
    }

    private static void stars() {

        try {
            System.out.println("Enter number of stars in column: ");
            rows = scanner.nextInt();

            System.out.println("Enter number of stars in row: ");
            col = scanner.nextInt();

            System.out.println("Number of rows: " + rows + "\nNumber of columns: " + col + "\n");

            System.out.println("Figure: ");

            for (int i = 0; i < rows; i++){
                System.out.print(" * ");

                for (int j = 0; j < col-1; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            run();

        } catch (Exception e) {
            System.out.println("Something wrong!");
            run();
        }
    }

}
