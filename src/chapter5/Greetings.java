package chapter5;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

// method, ask the user to enter there name and after that we have to greet them by there name
public class Greetings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name.");
        String name = scanner.nextLine();
        greetUser(name);
    }
    public static void greetUser(String name){
        System.out.println("Hi there! " + name);
    }
}
