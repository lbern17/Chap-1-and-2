//Extra credit assignment 3.6
/* In this extra credit assignment, I will create a program that gives a length of time based on the amount
of seconds a user has input. I will use an if-else-if method to do this. **/
import java.util.Scanner;

public class TimeCalc
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int seconds;
      double minutes;
      double hours;
      double days;
      
      System.out.print("Enter in a number of seconds:");
      seconds = keyboard.nextInt();
      
      minutes = seconds/60;
      hours = seconds/3600;
      days = seconds/86400;
      
      if(seconds >= 60 && seconds < 3600)
      System.out.print(minutes + " minutes have passed.");
      
      else if(seconds >= 3600 && seconds < 86400)
      System.out.print(hours + " hours , or " + minutes + " minutes, have passed.");
      
      else if(seconds >= 86400)
      System.out.print(days + " days, or " + hours + " hours, or " + minutes + " minutes, have passed.");
      
      else if (seconds < 60)
      System.out.print(seconds + " seconds have passed.");
   }
}