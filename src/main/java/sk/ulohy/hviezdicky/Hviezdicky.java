package sk.ulohy.hviezdicky;

import java.util.Scanner;

public class Hviezdicky {

    static int rows;
    static int col;

    public static void main(String[] args) {
        stars();
        writeOutStars();
    }

    private static void writeOutStars() {

    }

    private static void stars() {

        System.out.println("Enter number of stars in column: ");
        Scanner noRows = new Scanner(System.in);

        rows = Integer.parseInt(noRows.nextLine());

        System.out.println("Enter number of stars in row: ");
        Scanner noColumns = new Scanner(System.in);;

        col = Integer.parseInt(noColumns.nextLine());

        System.out.println("Number of rows: " + rows + "\nNumber of columns: " + col);

        System.out.println("Figure: ");

        for (int i = 0; i < rows; i++){
            System.out.print(" * ");

            for (int j = 0; j < col-1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
