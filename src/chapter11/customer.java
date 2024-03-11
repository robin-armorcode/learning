package chapter11;

public class customer {
    public static void main(String[] args) {
        product book = new book();
        book.setPrice(9.99);
        System.out.println(book.getPrice());
    }
}
