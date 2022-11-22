package sk.ulohy.hviezdicky;

import java.util.Scanner;

public class Hviezdicky {

    public static void main(String[] args) {
        stars();
    }

    private static void stars() {

        System.out.println("Enter number of stars in column: ");
        Scanner noRows = new Scanner(System.in);

        int rows;
        rows = Integer.parseInt(noRows.nextLine());

        System.out.println("Enter number of stars in row: ");
        Scanner noColumns = new Scanner(System.in);;

        int col;
        col = Integer.parseInt(noColumns.nextLine());

        System.out.println("Number of rows: " + rows + "\nNumber of columns: " + col);
    }
}
