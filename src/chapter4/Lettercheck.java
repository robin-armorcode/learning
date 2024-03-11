package chapter4;

import java.util.Scanner;

public class Lettercheck {
    public static void main(String[] args){
        //search for letter A or a in any input string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any text");
        String text = scanner.nextLine();
        scanner.close();
        boolean letterFound = false;
        for(int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("Letter 'a' present in text");
        }
        else {
            System.out.println(" letter not found");
        }
    }
}
