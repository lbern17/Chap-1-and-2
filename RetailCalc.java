//Extra Credit Assignment 5.2
/* In this extra credit assignment, I will make a program that gets the retail price based on the wholesale price
and markup percentage, based on input by the user. */
import java.util.Scanner;
public class RetailCalc
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      double wholesale;
      double markup;
      double markupPercent;
      double retailPrice = 0;
      
      System.out.println("What was the wholesale price of this item?");
      wholesale = keyboard.nextDouble();
      
      System.out.println("What is the markup percentage of this item?");
      markup = keyboard.nextDouble();
      
      calculateRetail(wholesale, markup);
   }
   public static void calculateRetail(double whole, double mark)
   {
      double markupPercent;
      markupPercent = whole*mark;
      double retailPrice;
      retailPrice = whole+markupPercent;
      
      System.out.println("The retail price of this item is " + retailPrice);

   }
}
      