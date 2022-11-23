package sk.ulohy.zoradeniePrvkovVPoli;

import java.util.Arrays;
import java.util.Collections;

public class zoradeniePrvkov {
    public static void main(String[] args) {

        int[] myArrayNum = {100, 25, 2, 35, 50, 8, 36, 3, 1, 99};
        Integer[] myArrayNumI = {100, 25, 2, 35, 50, 8, 36, 3, 1, 99};
        char[] myArrayChar = {'C', 'D', 'A', 'E', 'B'};
        String[] myArrayString = {"Citron", "Deka", "Apple", "Egres", "Banan"};

        System.out.println("Original array: " + Arrays.toString(myArrayNum));
        System.out.println("Original array: " + Arrays.toString(myArrayChar));
        System.out.println("Original array: " + Arrays.toString(myArrayNumI));
        System.out.println("Original array: " + Arrays.toString(myArrayString));

        //sort subarraz from index 2 to index 7
        Arrays.sort(myArrayNum, 2, 7);
        System.out.println();
        System.out.println("Sorted from to: " + Arrays.toString(myArrayNum));

        //Ascending
        Arrays.sort(myArrayNum);
        Arrays.sort(myArrayChar);
        Arrays.sort(myArrayNumI);
        Arrays.sort(myArrayString);

        System.out.println();
        System.out.println("Sorted ascending: " + Arrays.toString(myArrayNum));
        System.out.println("Sorted alphabetical order: " + Arrays.toString(myArrayChar));
        System.out.println("Sorted ascending: " + Arrays.toString(myArrayNumI));
        System.out.println("Sorted alphabetical order: " + Arrays.toString(myArrayString));

        //Descending -> Collections work only for nonprimitive data types
        Arrays.sort(myArrayNumI, Collections.reverseOrder());
        Arrays.sort(myArrayString, Collections.reverseOrder());

        System.out.println();
        System.out.println("Sorted descending: " + Arrays.toString(myArrayNumI));
        System.out.println("Sorted reverse: " + Arrays.toString(myArrayString));
    }
}
