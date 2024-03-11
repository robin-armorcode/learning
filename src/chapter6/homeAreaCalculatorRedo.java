package chapter6;

import java.util.Scanner;

public class homeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        homeAreaCalculatorRedo calculator = new homeAreaCalculatorRedo();
        rectangle kitchen = calculator.getArea();
        rectangle bathroom = calculator.getArea();
        double area = calculator.calculateTotalArea(kitchen,bathroom);
        calculator.scanner.close();
        System.out.println("total area is " + area);
    }
    public rectangle getArea(){
        System.out.println("enter the length");
        double length = scanner.nextDouble();

        System.out.println("enter the width");
        double width = scanner.nextDouble();

        return new rectangle(length, width);
    }
    public double calculateTotalArea(rectangle rec1, rectangle rec2){
        return rec1.calculateArea() + rec2.calculateArea();
    }
}
