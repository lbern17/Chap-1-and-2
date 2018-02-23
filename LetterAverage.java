//assignment 3.8
//This program will assign a discount based on the number of goods you purchase.

import java.util.Scanner;

/**

*/

public class LetterAverage
{
   public static void main(String[] args)
   {
      int goodsAmount;
      int goodsPrice;
      double discountAmount;
      double totalPrice;
      Scanner keyboard = new Scanner(System.in);

      System.out.print("How many goods have you purchased today?");      
      goodsAmount = keyboard.nextInt();
      System.out.println("You have purchased " +goodsAmount + " today. Thank you!");
      
      goodsPrice = 99 * goodsAmount;
      System.out.println("Your total purchase price before the discount is " + goodsPrice + ".");
      
            
      if(goodsAmount = 10-19);
      discountAmount = .2;
      else if(goodsAmount = 20-49)
      discountAmount = .3;
      else if(goodsAmount = 50-99)
      discountAmount = .4;
      else if(goodsAmount >= 100)
      discountAmount = .5;
      
      System.out.print("Based on the amount of goods you purchased, you will receive a " + discountAmount + " percent discount today!");
      
      totalPrice = goodsPrice * discountAmount;
      System.out.print("With the discount applied, your total purchase price is " + totalPrice + ".");
   }
}