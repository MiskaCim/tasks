package sk.ulohy.cenaPaliva;

import java.util.Scanner;

public class CenaPaliva {

    private static double consumption;
    private static double fuelPrice;
    private static double distance;
    private static double fuelVolume;
    private static double result;
    private static String line;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        do {
            System.out.println("***\nDo you want to calculate? [press anything to continue or X to exit]");
            line = scanner.nextLine().toUpperCase();

            if (!"X".equals(line)) {
                run();
            }
        } while (!"X".equals(line));
        System.out.println("End");
        System.exit(0);
    }

    private static void run() {

        try {
            System.out.println("\nWhat is the distance of your journey [km]?");
            distance = Double.parseDouble(scanner.nextLine());   //toto zle funguje scanner.nextDouble();

            System.out.println("What is the consumption of your car [l/100km]?");
            consumption = Double.parseDouble(scanner.nextLine());

            System.out.println("What is the price of fuel [€/l]?");
            fuelPrice = Double.parseDouble(scanner.nextLine());

            result = (consumption * fuelPrice * distance) / 100;
            fuelVolume = (consumption * distance) /100;

            System.out.println("For your journey (" + distance + " km) you need " + fuelVolume + " l of fuel for " + result + " €.");
        } catch (Exception e) {
            System.out.println("Wrong input!");
        }

    }
}
