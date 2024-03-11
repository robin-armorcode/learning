package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        // get the no. of hours worked
        System.out.println("Enter the no. of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // get the hourly pay rate
        System.out.println("enter the employee pay rate");
        double rate =  scanner.nextDouble();
        scanner.close();

        //multiply the hours with pay rate
        double grossPay = hours * rate;

        //Display result
        System.out.println("The employees gross pay is " + grossPay);
    }
}
