package sk.ulohy.priemerZnamok;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PriemerZnamok {

    private static Scanner scanner = new Scanner(System.in);
    private static String marks;

    public static void main(String[] args) {
        run();

    }

//    private static void run() {
//        System.out.println("Write marks separated by a comma: ");
//        marks = scanner.nextLine();
//        System.out.println("You entered these marks: " + marks);
//
//        String[] marksArray = new marks.split(",", 2);
//
//        for (int i = 0; i < marks.length(); i++) {
//            System.out.println("cislo: " + marksArray[i]);
//        }
//
//    }

    private static void run() {
        System.out.println("Write marks separated by a comma only (example: 1,2,3): ");
        marks = scanner.nextLine();
        System.out.println("You entered these marks: " + marks);

        //rozdelenie stringov -> na zaklade ciarky
        String[] marksArray = marks.trim().split(",");

        //vytvorenie pola do, kt budem ukladat int z pola stringov
        int[] numMarksArray = new int[marksArray.length];

        //vypis pola stringov
        for (String mA : marksArray) {
            System.out.println(mA);
        }
        /* Alebo takto:
        for (int i = 0; i < marksArray.length; i++) {
            System.out.println("cislo: " + marksArray[i]);
        }    */

        //pretypovanie pola stringov na int
        for (int i = 0; i < marksArray.length; i++){
            numMarksArray[i] = Integer.parseInt(marksArray[i]);
            System.out.println(numMarksArray[i]);
        }


        int sum = IntStream.of(numMarksArray).sum();
        System.out.println("Sum of elements in array: " + sum);

        int avg = sum/numMarksArray.length;
        System.out.println("Average of marks in array: " + avg);
    }
}


