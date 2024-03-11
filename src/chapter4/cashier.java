package chapter4;

import java.util.Scanner;

public class cashier {
    public static void main(String[] args){
        //for loop
        //write a cashier program that will scan a given number of items and tally the cost.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of items");
        int itemCount = scanner.nextInt();
        double item_price;
        double sum = 0;
        // calculate price
        for (int i=1; i<=itemCount;i++ ){
            System.out.println("Enter item price.");
            item_price = scanner.nextDouble();
            sum = sum + item_price;
        }
        System.out.println("Amount to pay " + sum);

    }
}
