//Extra Credit Assignment 2.17
/* In this extra credit assignment, I will write a program that gives the details on Joe's stock transactions,
and calculate whether or not he made a profit on said transactions.**/

public class StockTransactions
{
   public static void main(String[] args)
   {
      int sharesPurchased = 1000;
      double stockPrice = 32.87;
      double commission1;
      double stockSoldPrice = 33.92;
      double commission2;
      
      double purchasePrice = sharesPurchased*stockPrice;
      
      System.out.println("Joe paid $" + purchasePrice + " for his shares before commission fees.");
      
      commission1 = purchasePrice*.02;
      
      System.out.println("Joe paid $" + commission1 + " in commission fees while purchasing.");
      
      double sellingPrice = sharesPurchased*stockSoldPrice;
      
      System.out.println("Joe sold his shares and made $" + sellingPrice + ".");
      
      commission2 = sellingPrice*.02;
      
      System.out.println("Joe paid $" + commission2 + " in commission fees during this transaction");
      
      double totalProfit = sellingPrice-purchasePrice-commission1-commission2;
      
      System.out.println("In all, Joe made a $" + totalProfit + " profit.");
   }
}