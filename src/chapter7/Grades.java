package chapter7;
import java.util.Scanner;

public class Grades {
    public static int[] grade;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //highest, lowest and avg using array
        System.out.println("enter total no of grades you wants to enter");
        grade = new int[scanner.nextInt()];
        setgrade();
        marks();
    }
    public static void setgrade(){
        for (int i = 0; i < grade.length; i++) {
            System.out.println("enter grade no. " + i);
            grade[i] = scanner.nextInt();
        }
    }
    public static void marks(){
        int lowest = grade[0];
        int highest = grade[0];
        float avg;
        int sum = 0;
        for (int i = 0; i < grade.length; i++) {
            if (lowest > grade[i]) {
                lowest = grade[i];
            }
            if(highest < grade[i]) {
                highest = grade[i];
            }
            sum = sum + grade[i];
        }
        avg = sum/grade.length;
        System.out.println("you avg is " + String.format("%.2f",avg));
        System.out.println("your highest marks is " + highest);
        System.out.println("your lowest marks is " + lowest);

    }
}
