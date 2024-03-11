package chapter6;

public class check {
    public static void main(String[] args){
        rectangle obj1 = new rectangle();
        rectangle obj2 = new rectangle();
        obj1.setLength(35);
        System.out.println(obj1.getLength());
        obj2.setLength(36);
        System.out.println(obj1.getLength());
        System.out.println(obj2.getLength());    }
}
