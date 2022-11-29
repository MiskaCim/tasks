package sk.ulohy.zapisCitanieSubor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZapisCitanieSUbor {

    private static Scanner scanner = new Scanner(System.in);
    private static String option, content, fileName, inputName;

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {

        do {
            System.out.println("\nChoose option: \n1.Create new file \n2.View files \n3.Exit");
            option = scanner.nextLine().toUpperCase();

            switch (option) {
                case "1":
                    createFile();
                    break;
                case "2":
                    viewFiles();
                    break;
            }

        } while (!"3".equals(option));
        System.out.println("End");
        System.exit(0);

    }

    private static void createFile() {
        System.out.println("Write into file (content): ");
        content = scanner.nextLine();
        System.out.println("Write file name: ");
        fileName = scanner.nextLine();

        //create file
        try{
            File myFile = new File("D:\\JavaAkademia\\Projekty\\ulohy\\src\\main\\java\\sk\\ulohy\\createdFiles\\" + fileName + ".txt");
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
            FileWriter myWriter = new FileWriter("D:\\JavaAkademia\\Projekty\\ulohy\\src\\main\\java\\sk\\ulohy\\createdFiles\\" + fileName + ".txt");
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    private static void viewFiles() {
        //https://www.tutorialspoint.com/how-to-get-list-of-all-files-folders-from-a-folder-in-java

        File directoryPath = new File("D:\\JavaAkademia\\Projekty\\ulohy\\src\\main\\java\\sk\\ulohy\\createdFiles");

        //List of all files in directory
        String allFiles[] = directoryPath.list();
        System.out.println("Existing files: ");
        for(int i = 0; i < allFiles.length; i++){
            System.out.println(allFiles[i]);
        }

        System.out.println();
        System.out.println("Choose name of file to see its content: ");
        inputName = scanner.nextLine();

//        for(int i = 0; i < allFiles.length; i++) {
//            String fileFromArray = allFiles[i];
//            if (fileFromArray == inputName+".txt"){
//                System.out.println("File exist :)");
                try {
                    File myObj = new File("D:\\JavaAkademia\\Projekty\\ulohy\\src\\main\\java\\sk\\ulohy\\createdFiles\\" + inputName + ".txt");

                    Scanner myReader = new Scanner(myObj);
                    System.out.println("In file " + inputName + ", is this content: ");
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

//            } else {
//                System.out.println("File with name "+ inputName + " does not exist!");
//            }
//        }

    }


}
