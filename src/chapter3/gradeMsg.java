package chapter3;

import java.util.Scanner;

public class gradeMsg {
    public static void  main(String[] args){
        System.out.println("enter your grade");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        String message;
        switch (grade){
            case "A":
                message = "Great job";
                System.out.println(message);
                break;
            case "B":
                message = "Good job";
                System.out.println(message);
                break;
            case "C":
                message = "need improvement";
                System.out.println(message);
                break;
            case "D":
                message = "work hard";
                System.out.println(message);
                break;
            default:
                message = "error! invalid grade";
                System.out.println(message);
                break;
        }

    }
}
