package chapter7;
import sun.plugin.javascript.navig.Array;

import java.util.*;
public class lotteryTicket {
    public static final int LENGTH = 6;
    public static final int Max_ticket_number = 70;
    public static void main(String[] args) {
        int[] ticket = generateNumber();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    public static int[] generateNumber(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        int randomNumber;
        for (int i = 0; i < LENGTH; i++) {
            do {
                randomNumber = random.nextInt(Max_ticket_number);
            }while(search(ticket,randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }
    public static void printTicket(int[] ticket){
        for (int i = 0; i <LENGTH ; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
    public static boolean search(int[] ticket, int randomNumber){
        for ( int value : ticket ){
            if (value == randomNumber){
                return true;
            }
        }
        return false;
    }
    /*public static boolean binarySearch(int[] array, int search_for){
        Arrays.sort(array);
        return Arrays.booleanSearch(array,search_for);
    }*/
}
