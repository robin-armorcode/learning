package chapter9;

public class rectangle {
    protected int length;
    protected int width;
    protected int side;
    protected int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public int calcPerimeter(){
        return 2*(length + width);
    }
    public void print(){
        System.out.println("i am a rectangle");
    }
}
