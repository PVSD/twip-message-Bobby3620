package com.company;
import java.text.SimpleDateFormat;
import java.util.*;

public class Message {

    //This allows me to use access the time, and return the number and finally the user's text messages
    public Message(String n, String t){
        number = n;
        text = t;
    }

    //This only includes the timeRecieved and number
    //This will access the most recent text
    public void PrintText(){
        ArrayList formatList = new ArrayList();

            formatList.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
            formatList.add(number);
            formatList.add(text);
            System.out.print("The time received " + formatList.get(0));
            System.out.print(" from " + formatList.get(1));
            System.out.println(": " + formatList.get(2));

    }


    public String number;
    public String text;

}
