package chapter8;

public class textProcessor {
    public static void main(String[] args) {
        countword("I love Test Automation University");
        reversestring("I love Test Automation University");
        addSpace("HeyWorldIt'sRobin");
        // write a method that write count the number of
        // words in a string and print them individually in a new line.
    }

    /**
     *
     * @param text
     */
    public static void countword(String text){
        String[] words = text.split(" ");
        int numberOfWorkds = words.length;
        System.out.println(numberOfWorkds);
        for (int i = 0; i < numberOfWorkds; i++) {
            System.out.println(words[i]);
        }
    }
    public static void reversestring(String text){
        for (int i = text.length()-1; i >=0 ; i--) {
            System.out.print(text.charAt(i));
        }
    }
    public static void addSpace(String text){
        StringBuilder modifiedText =new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println("\n" + modifiedText);
    }
}
