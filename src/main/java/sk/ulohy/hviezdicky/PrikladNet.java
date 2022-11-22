package sk.ulohy.hviezdicky;

import java.util.Scanner;

public class PrikladNet {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.print("Choose number and I wil show you 2^number stars: ");
            System.out.println(starString(in.nextInt()));
        }

        public static String starString(int n) {
            if (n < 0) {
                throw new IllegalArgumentException();
            } else if (n == 0) {
                return "*";
            } else {
                return starString(n - 1) + starString(n - 1);
            }
        }
    }

    //tento kod je odtial: https://stackoverflow.com/questions/60724091/how-to-print-number-of-stars-depending-on-user-choose
    //help: https://www.geeksforgeeks.org/printing-triangle-star-pattern-using-a-single-loop/?ref=rp


