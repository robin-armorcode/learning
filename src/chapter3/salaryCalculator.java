package chapter3;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args){
        //input item sell by the seller
        System.out.println("how many items you sold");
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        //calculate salary
        int salary = 1000;
        int maxCount = 10;
        if(items > maxCount){
            salary = salary + 250;
        }
        //give salary
        System.out.println("You salary is $" + salary);
    }
}
