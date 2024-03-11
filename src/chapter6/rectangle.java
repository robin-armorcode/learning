package chapter6;

public class rectangle {
    private double length;
    private double width;
    public rectangle(){
        setLength(0);
        setWidth(0);
    }
    public rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double calculatePerimeter(){
        return (2 * (this.length + this.width));
    }
    public double calculateArea(){
        return this.length * this.width;
    }
}
