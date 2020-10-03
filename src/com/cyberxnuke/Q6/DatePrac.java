package com.cyberxnuke.Q6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class DatePrac {
    public static void main(String[] args){
        System.out.println("Enter date? ");
      Scanner in = new Scanner(System.in);
      String dateInput = in.nextLine();
      DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

      DatePrac obj = new DatePrac();

      try {
          Date date = (Date) formatter.parse(dateInput);
          int result = obj.checkDateCompare(date, formatter);
          if(result > 1){
            System.out.println("Date you entered is after today's date.");
          } else if(result == 0){
              System.out.println("Date you entered is today's date.");
          } else {
              System.out.println("Date you entered is before today's date.");
          }

          obj.convertDate(date);

      } catch (Exception e){
          System.out.println(e.fillInStackTrace());
      }
    }

    public int checkDateCompare(Date date, DateFormat formatter){
        Date today = new Date();
        String todayFormattedDate = formatter.format(today); // yyyy-MM-dd
        System.out.println("Today's Date: " + todayFormattedDate);
        try {
            return date.compareTo(formatter.parse(todayFormattedDate));
        } catch (ParseException e) {
            e.printStackTrace();
            return -100;
        }
    }

    public void convertDate(Date date){
        // "yyyy-MM-dd HH:mm:ssZ"
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ"); // Z = Timezone
        System.out.println("\nFormatted Date: " + format.format(date));
    }
}
