package chapter4;

import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("enter first no. ");
            double num1 = scanner.nextDouble();

            System.out.println("enter second no. ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("sum is " + sum);
            System.out.println("would you like to start over?");
            again = scanner.nextBoolean();
        }while (again);
    }
}
