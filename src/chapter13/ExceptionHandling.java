package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
        createFile();
        numberExceptionHandling();
        rethrowcreateFile();
    }
    public static void createFile(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }
    public static void rethrowcreateFile() throws IOException{
        File file = new File("resources/nonexistent.txt");
            file.createNewFile();
    }
    public static void numberExceptionHandling() {
        File file = new File("resources/numberFile.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                double num = scanner.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) { //this is a parent class "Exception". we can not define it before other exception.
            System.out.println("Not expected error");
        } finally {
            scanner.close();
        }
    }
}

/**
 * we can also create a subclass of Exception Class. where we can give custom exception.
 */