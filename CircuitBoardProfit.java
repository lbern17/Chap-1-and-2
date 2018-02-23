//Extra Credit Assignment 2.11
/* In this extra credit assignment, I will make a program that calculates a 40% profit from
a given price for a circuit board. **/
import java.util.Scanner;

public class CircuitBoardProfit
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      float profit = 0.4f;
      float retailPrice;
      float Totalprofit;
      
      System.out.println("What is the retail price of the circuit board in question?");
      retailPrice = keyboard.nextFloat();
      
      Totalprofit = profit*retailPrice;
      
      System.out.println("With a 40% profit margin, you've had a " + Totalprofit + " profit!");
   }
}