package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Creating objects here
        Scanner kbInput = new Scanner(System.in);
        String number;
        String text;
        int count = 0;

        //Can keep texting until user enters EXIT
        System.out.println("Type START(not case sensitive) to start texting. Type EXIT(case sensitive) to stop texting.");
        text = kbInput.nextLine();

            if(text.equalsIgnoreCase("START")){
                System.out.println("What is your number?");
                number = kbInput.nextLine();
                do{
                    System.out.println(" "); //For the space after m.format
                    System.out.println("Send something");
                    text = kbInput.nextLine();
                    Message m = new Message(number, text);
                    m.PrintText();
                    count++;
                        if(count == 5){
                            System.out.println("Would you like to make a group chat?");
                            String answer = kbInput.nextLine();
                                if(answer.equalsIgnoreCase("yes")){
                                    System.out.println("test");
                                } else{

                                }
                        }

                }while(!"EXIT".equals(text));
            }
    }
}
