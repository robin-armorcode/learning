package chapter10;

public class zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.makeSound();
        rocky.fetch();
        feed(rocky);

        animal sheru = new Dog();
        sheru.makeSound();
        feed(sheru);

        sheru = new cat();
        sheru.makeSound();
        ((cat) sheru).scratch();
        feed(sheru);
    }
    public static void feed(animal animal){
        if(animal instanceof Dog){
            System.out.println("here we have dog food.");
        } else if (animal instanceof cat) {
            System.out.println("this is a cat food.");
        }
        else{
            System.out.println("we have to figure out your food type");
        }
    }
}
