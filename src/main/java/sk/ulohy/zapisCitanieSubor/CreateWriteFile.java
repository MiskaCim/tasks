package sk.ulohy.zapisCitanieSubor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateWriteFile {


    public static void main(String[] args) {
        //https://www.w3schools.com/java/java_files_delete.asp

        //create file
        try{
            File myFile = new File("D:\\JavaAkademia\\Projekty\\ulohy\\src\\main\\java\\sk\\ulohy\\createdFiles\\secondFile.txt");
            if(myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //write to file
        try {
            FileWriter myWriter = new FileWriter("D:\\JavaAkademia\\Projekty\\ulohy\\src\\main\\java\\sk\\ulohy\\createdFiles\\secondFile.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //read file
        try {
            File myObj = new File("D:\\JavaAkademia\\Projekty\\ulohy\\src\\main\\java\\sk\\ulohy\\createdFiles\\secondFile.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //delete file
        File myObj = new File("D:\\JavaAkademia\\Projekty\\ulohy\\src\\main\\java\\sk\\ulohy\\createdFiles\\firstFile.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
