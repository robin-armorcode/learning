package chapter3;

import java.util.Scanner;

public class logicalOperationLoanQualifier {
    public static void main(String[] args){
        /*
        logical operations
         to qualify a loan a person must have $30000
         and 2 year working professional
        */
        // input salary and year of working
        System.out.println("what is your salary");
        Scanner sal = new Scanner(System.in);
        int salary = sal.nextInt();

        System.out.println("how many years you are working in");
        Scanner yr = new Scanner(System.in);
        int years = yr.nextInt();
        // checking conditions and give approval for loan
        if(salary >= 30000 && years >= 2){
            System.out.println("you are eligible for loan");
        }
        else {
            System.out.println("your salary at least 30000 and 2 years working");
        }

    }
}
