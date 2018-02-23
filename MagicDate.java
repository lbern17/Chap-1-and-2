//Extra Credit Assignment 3.2
/* In this extra credit assignment, I will make a "magic date" program. The use plugs in a day and a month, and 
if the month times the day is equal to the year, is will be a "magic date". This program will use a if-else statements
to determine thus. **/
import java.util.Scanner;

public class MagicDate
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int day;
      int month;
      int year;
      int magicDate;
      
      System.out.print("Pick a day in a month:");
      day = keyboard.nextInt();
      
      System.out.print("Pick a month, and write it in it's numeric form:");
      month = keyboard.nextInt();
      
      System.out.print("Pick a year, and write it in its 2-digit form:");
      year = keyboard.nextInt();
      
      magicDate = day*month;
      
      if(magicDate == year)
         System.out.print("Your date is " + month + "/" + day + "/" + year + ". You have a magic date! Hooray!");
         
      else
         System.out.print("Your date is " + month + "/" + day + "/" + year + ". You do not have a magic date. Sorry.");
   }
} 