package chapter9;

public class square extends rectangle{
    @Override
    public int calcPerimeter(){
        return side*length;
    }
    public void print(String a){
        System.out.println("i am a rectangle");
    }
}
