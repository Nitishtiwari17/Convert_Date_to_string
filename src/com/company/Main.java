package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
        Date date=Calendar.getInstance().getTime();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-M-d hh:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println("converted string:"+strDate);
	// write your code here
    }
}
