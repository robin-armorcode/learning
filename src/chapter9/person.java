package chapter9;

public class person {
    private String name;
    private int age;
    private String gender;
    public person(){
        System.out.println("this is person class default constructor");
    }
    public person(String text){
        System.out.println("this is 2nd constructor of person class. if you want" +
                " to use this constructor in child class you should use super() keyword in child constructor.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}

