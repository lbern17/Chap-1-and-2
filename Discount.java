//assignment 3.8
//This program will assign a discount based on the number of goods you purchase.

import java.util.Scanner;

/**

*/

public class Discount
{
   public static void main(String[] args)
   {
      int Amount;
      int Price;
      double discountAmount = 0.0;
      double totalPrice;
      Scanner keyboard = new Scanner(System.in);

      System.out.print("How many goods have you purchased today?");      
      Amount = keyboard.nextInt();
      System.out.println("You have purchased " +Amount + " today. Thank you!");
      
      if(Amount < 10)
      discountAmount = .0;
      else if(Amount < 20)
      discountAmount = .2;
      else if(Amount < 50)
      discountAmount = .3;
      else if(Amount < 100)
      discountAmount = .4;
      else if(Amount >100)
      discountAmount = .5;
      
      System.out.print("Based on the amount of goods you purchased, you will receive a " + discountAmount + " percent discount today!");
      Price = 99 * Amount;
      System.out.println("Your total purchase price before the discount is " + Price + ".");
      
      
      totalPrice = Price * discountAmount;
      System.out.print("With the discount applied, your total purchase price is " + totalPrice + ".");
   }
}