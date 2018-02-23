//Extra Credit Assignment 2.9
/* In this extra credit assignment, I will make a program that will give the use the MPG of
a given car based on miles driven and gallons of gas used.**/
import java.util.Scanner;

public class MPG
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int miles;
      int gallonsUsed;
      int mpg;
      
      System.out.println("Enter the amount of miles you travel on one tank of gas.");
      miles = keyboard.nextInt();
      
      System.out.println("Enter the amount of gallons used while driving on one tank.");
      gallonsUsed = keyboard.nextInt();
      
      mpg = miles/gallonsUsed;
      
      System.out.println("Based on the data entered in, your estimated MPG is " + mpg + ".");
   }
}