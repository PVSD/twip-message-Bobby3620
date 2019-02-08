package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Creating objects here
        Scanner kbInput = new Scanner(System.in);
        String number1;
        String number2;
        String text1;
        String text2;
        String start;

        //Can keep texting until user enters EXIT
        System.out.println("Type START(not case sensitive) to start texting. Type EXIT(case sensitive) to stop texting.");
        start = kbInput.nextLine();

            if(start.equalsIgnoreCase("START")){
                System.out.println("What is your number?");
                number1 = kbInput.nextLine();
                System.out.println("What's your friend's number?");
                number2 = kbInput.nextLine();
                do{
                    System.out.println(" "); //For the space after m.format
                    System.out.println("Send something " + number1);
                    text1 = kbInput.nextLine();
                    System.out.println("Send something " + number2);
                    text2 = kbInput.nextLine();

                    Message m = new MessageList(number1, number2, text1, text2);
                    ((MessageList) m).PrintConversion();


                }while(!"EXIT".equals(start));
            }
    }
}
