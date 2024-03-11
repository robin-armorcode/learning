package chapter4;

import java.util.Scanner;

public class grossPayInputValidation {
    public static void main(String[] args){
        /*while loop
        each store employee make $50 per hour. create a program that allow the employee to enter the hours they worked.
        do not allow overtime
         */
        int maxhours = 40;
        int minihours = 1;
        int rate = 15;

        System.out.println("enter the hours you worked");
        Scanner sc = new Scanner(System.in);
        int workedhours = sc.nextInt();

        // calculate salary
        while (workedhours > maxhours || workedhours < minihours){
            System.out.println("please enter the correct working hours.");
            workedhours = sc.nextInt();
        }
        sc.close();
        //calculate gross
        double gross = rate * workedhours;
        System.out.println("your salary is " + gross);
    }
}
