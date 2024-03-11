package chapter11;

public class rectangle extends Shape{
    private int width;
    private int length;
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public rectangle(int length, int width){
        setLength(length);
        setWidth(width);
    }

    @Override
    void calculateArea() {
        System.out.println(length*width);
    }
}
