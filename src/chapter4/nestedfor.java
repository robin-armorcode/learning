package chapter4;

import java.util.Scanner;

/* average marks of every student of 24 strength and 4 subjects.*/
public class nestedfor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int studentCount = 24;
        int subjectCount = 4;
        for (int i = 0; i <studentCount ; i++) {
            System.out.println("student " + (i+1));
            int total = 0;
            int studentAvg = 0;
            for (int j = 0; j < subjectCount; j++) {
                System.out.println("Enter marks in subject" + (j+1));
                int mark = scanner.nextInt();
                total = total + mark;
                studentAvg = total/4;
            }
            System.out.println("Student " + (i+1) + " average marks are " + studentAvg);
        }
    }
}
