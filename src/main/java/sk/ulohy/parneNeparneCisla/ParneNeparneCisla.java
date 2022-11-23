package sk.ulohy.parneNeparneCisla;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ParneNeparneCisla {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 10, 13, 25, 50, 100, 125, 133, 152, 200};

// ****************************** LEN VYPISY ************************************
        //vypis celeho pola
        System.out.println("Numbers: " + Arrays.toString(numbers));

        //vypis neparnych cisel
        System.out.println("Odd numbers from array: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + ",");
            }
        }
        System.out.println();


        //vypis parnych cisel
        System.out.println("\nEven numbers from array: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + ",");
            }
        }
        System.out.println();


// ****************************** Vytvorenie novy poli ************************************
        int oddSize = 0;
        int evenSize = 0;
        int length = numbers.length;
        System.out.println("Length: " + length);

        for (int i = 0; i < length; i++) {
            if (numbers[i] % 2 != 0) {
//                oddSize = oddSize +1;
                oddSize++;
            } else {
                evenSize = evenSize + 1;
            }
        }

        int[] arrOdd = new int[oddSize];
        int[] arrEven = new int[evenSize];

        System.out.println();
        System.out.println("odd: " + oddSize);
        System.out.println("even: " + evenSize);

        int j = 0;
        int k = 0;

        for (int i = 0; i < length; i++) {
            if (numbers[i] % 2 != 0) {
                arrOdd[j++] = numbers[i];
            } else {
                arrEven[k++] = numbers[i];
            }
        }
        System.out.println("Array odd: " + Arrays.toString(arrOdd));
        System.out.println("Array odd: " + Arrays.toString(arrEven));

    }
}

//            odd[i] = new numbers[i];
//            if (numbers[i]%2 == 0){
//                //parne cisla
//                even[i] = numbers[i];
//                System.out.println(even[i]);
//            } else {
//                //neparne cisla
//                odd[i] = numbers[i];
//                System.out.println(odd[i]);
//            }


