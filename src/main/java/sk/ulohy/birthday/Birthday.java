package sk.ulohy.birthday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Birthday {
//prerobit, trochu zle to ukazuje
    //https://www.java67.com/2021/08/how-to-calculate-next-date-and-year-in.html
    //https://stackoverflow.com/questions/59653617/calculate-next-birthday-date-given-a-birhdate

    private static Scanner scanner = new Scanner(System.in);
    private static String bDayString;
    private static Date bDayDate;

    public static void main(String[] args) throws ParseException {

        System.out.println("What is your birth date?");
        bDayString = scanner.nextLine();

        Date today = new Date();
//        System.out.println("Today is " + today);

//      Parsovanie zadaneho stringu na datum (java.util.Date):
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            bDayDate = sdf.parse(bDayString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Entered date: " + bDayString);
        System.out.println("Today Date: " + sdf.format(today));

//        System.out.println("Date: " + bDayDate);
//        System.out.println("Formatted Date: " + sdf.format(bDayDate));

        long diffInMillies = Math.abs(bDayDate.getTime() - today.getTime());
        long diffDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        long years = diffDays/365;
        long days = diffDays%365;
        long nextBDay = 365- days;
        long nextAge = years + 1;

        System.out.println(diffInMillies);
        System.out.println("You have: " + diffDays + " days.");
        System.out.println("You have " + years + " years and " + days + " days.");
        System.out.println("Your next birthday will be in " + nextBDay + " days.");
        System.out.println("You will be " + nextAge + " years old.");
    }
}

// Moznosti vypisania datumu a casu:
//        LocalDateTime today = LocalDateTime.now();
//        LocalDate today = LocalDate.now();
//        LocalDate today = LocalDate.now();
//
// Zmena formatu pre java.time.LocalDate:
//        System.out.println("LocalDateTime before formatting: " + today);
//        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//
//        String formattedToday = today.format(myFormat);
//        System.out.println("After formatting: " + formattedToday);