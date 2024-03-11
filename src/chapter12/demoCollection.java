package chapter12;

import java.util.*;

public class demoCollection {
    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }
    public static void setDemo(){
        Set fruit = new HashSet();
        fruit.add("banana");
        fruit.add("lemon");
        fruit.add("grapes");
        fruit.add("apple");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

//        Iterator i = fruit.iterator();
//        while (i.hasNext()){
//           System.out.println(i.next());
//        }

//        for(Object item: fruit){
//            System.out.println(item);
//        }

        fruit.forEach(System.out::println);
    }
    public static void listDemo(){
        List fruit = new ArrayList();
        fruit.add("lemon");
        fruit.add("mango");
        fruit.add("pineapple");
        fruit.add("greenapple");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println(fruit.get(2));
    }
    public static void queueDemo(){
        Queue fruit = new LinkedList();
        fruit.add("peaches");
        fruit.add("grapes");
        fruit.add("orange");
        fruit.add("peaches");
        fruit.add("mango");

        System.out.println(fruit.size());
        System.out.println(fruit.peek());
        fruit.remove("mango");
        System.out.println(fruit.poll());
    }
    public static void mapDemo(){
        Map<String,Integer> fruit = new HashMap();
        fruit.put("banana", 76);
        fruit.put("peaches", 69);
        fruit.put("mango", 50);
        fruit.put("grapes", 49);
        fruit.put("banana", 89);

        System.out.println(fruit.get("mango"));
        System.out.println(fruit);
        System.out.println(fruit.entrySet()); // this will give as a set object.

        fruit.remove("mango");
        System.out.println(fruit);
        for(Map.Entry<String, Integer> entry: fruit.entrySet()){
            System.out.println(entry.getValue());
        }
        fruit.forEach((k,v)-> System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}
