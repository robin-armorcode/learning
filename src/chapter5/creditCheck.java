package chapter5;

import java.util.Scanner;

// this program give credit to user who make more than $25000 and credit score is 700 and more.
public class creditCheck {

    static Scanner scanner = new Scanner(System.in);
    static int requiredSalary = 25000;
    static int requiredScore = 700;

    public static void main(String[] args){
    // initialize what we know added in global variable
    // get what we don't know
        int actualSalary = getSalary();
        int actualScore = getScore();
        boolean result;
        scanner.close();
    // check if the user is qualified.
        result = calculateApproval(actualSalary,actualScore);
    // notify user
        notify(result);
    }
    public static int getSalary(){
        System.out.println("what is you current salary");
        int actualSalary = scanner.nextInt();
        return actualSalary;
    }
    public static int getScore(){
        System.out.println("what is you current Score");
        int actualScore = scanner.nextInt();
        return actualScore;
    }
    public static boolean calculateApproval(int actualSalary, int actualScore){
        if (actualSalary >= requiredSalary && actualScore >= requiredScore){
            return true;
        }
        else {
            return false;
        }
    }
    public static void notify(boolean result){
        if (result){
            System.out.println("you are eligible to get loan");
        }
        else {
            System.out.println("your are not eligible to get loan");
        }
    }

}
