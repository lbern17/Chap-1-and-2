//Extra Credit Assignment 5.10

/* In this extra credit assignment, I will create a program that uses methods to produce the total profit from
a given stock, based on information provided by the user. */
import java.util.Scanner;

public class StockProfit
{
   public static void main(String[] args)
   {
      Scanner key = new Scanner(System.in);
      
      double shareNumber;
      double purchasePrice;
      double purchaseCommission;
      double sharePrice;
      double saleShare;
      double salePrice;
      double saleCommission;
   
      System.out.println("How many shares of this stock did you buy?");
      shareNumber = key.nextInt();
      
      System.out.println("What was the price per share for this stock?");
      sharePrice = key.nextDouble();
      
      purchasePrice = shareNumber+sharePrice;
      
      System.out.println("What is the purchase commission paid during this transaction?");
      purchaseCommission = key.nextDouble();
      
      System.out.println("What was the sale price per share for this stock?");
      saleShare = key.nextDouble();
      
      salePrice = shareNumber*saleShare;
      
      System.out.println("What is the sale commission paid during this transaction?");
      saleCommission = key.nextDouble();
      
      finalProfit(shareNumber, purchasePrice, purchaseCommission, salePrice, saleCommission);
   }
   public static void finalProfit(double sn, double pp, double pc, double sp, double sc)
   {
      double finalTotal;
      double buy;
      double sell;
      
      buy = ((sn*pp)+pc);
      sell = ((sn*sp)-sc);
      finalTotal = sell-buy;
      
      System.out.println("Your profit is " + finalTotal);
   }
}
   