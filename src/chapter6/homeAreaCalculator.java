package chapter6;

public class homeAreaCalculator {
    public static void main(String[] args){
        //calculate carpet area of house
        /***********************
         * Rectangle1 or room1
         **********************/
        rectangle room1 = new rectangle();
        room1.setLength(35);
        room1.setWidth(36);
        double area1 = room1.calculateArea();

        /***********************
         * Rectangle2 or room2
         **********************/
        rectangle room2 = new rectangle(70,78);
        double area2 = room2.calculateArea();
        double totalArea = area1 + area2;
        System.out.println("Total area is " + totalArea);
    }
}
