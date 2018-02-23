//Extra Credit Assignment 4.4
/* In this extra credit assignment, I will make a program using loops that shows the amount a worker will make
if they get paid a certain amount of pennies per day, based on user input. **/
import java.util.Scanner;

public class PennyPay
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int days;
      int pennies;
      int pennyPay;
      int pennydouble = 2;
      int maxDays;
      
      System.out.print("How many days have you worked?");
      maxDays = keyboard.nextInt();
      
      System.out.println("Days          Pennies Earned");
      System.out.println("____________________________");
  
      for(days = 1; days <= maxDays; ++days)
      {
      pennies = days*2;
      System.out.println(days + "                    " + pennies);
      }
   }
   
}