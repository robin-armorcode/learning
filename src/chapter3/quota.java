package chapter3;

import java.util.Scanner;

public class quota {
    public static void main(String[] args){
        //if else
        //take input of sales
        System.out.println("Enter the current count of item sold");
        Scanner sc = new Scanner(System.in);
        int soldItem = sc.nextInt();
        //return get quota or not
        int quota = 10;
        if (soldItem >= quota){
            System.out.println("You will definitely get quota");
        }
        else {
            System.out.println("you have to sold " + (quota - soldItem) + " items to get quota");
        }

    }
}
