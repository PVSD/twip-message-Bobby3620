package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MessageList extends Message {

    public MessageList(String n1, String n2, String t1, String t2){
        super(n1, n2, t1, t2);
            number1 = n1;
            number2 = n2;
            text1 = t1;
            text2 = t2;
    }


    //This only includes the timeRecieved and number
    //This will access the most recent text
    public void PrintConversion(){
        ArrayList formatList = new ArrayList();

        formatList.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime())); //0
        formatList.add(number1); //1
        formatList.add(text1); //2

        formatList.add(number2); //3
        formatList.add(text2); //4

        System.out.println(formatList.get(1) + " sent a message to " + formatList.get(3) + " at " + formatList.get(0) + " saying: " + formatList.get(2));
        System.out.println(formatList.get(2) + " sent a message to " + formatList.get(1) + " at " + formatList.get(0) + " saying: " + formatList.get(4));

    }

    public void ClearConversion(){

    }

    public String number1;
    public String number2;
    public String text1;
    public String text2;
}
