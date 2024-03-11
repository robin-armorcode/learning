package chapter10;

public class cat extends animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
    public void scratch(){
        System.out.println("iam a cat. i scratch things.");
    }
}
