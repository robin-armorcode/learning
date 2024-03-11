package chapter3;

import java.util.Scanner;

public class testResults {
    public static void  main(String[] args){
        // get the test score
        System.out.println("enter you marks");
        Scanner sc = new Scanner(System.in);
        double marks = sc.nextDouble();
        // determine the letter grade
        char grade;
        if (marks < 60){
            grade = 'F';
        }
        else if (marks < 70 ){
            grade = 'E';
        }
        else if (marks < 80 ){
            grade = 'D';
        }
        else if (marks < 90 ){
            grade = 'C';
        }
        else{
            grade = 'B';
        }
        // show letter grade
        System.out.println("yours grade is  " + grade);
    }
}
