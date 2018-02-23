//Extra Credit Assignment 2.12
/* In this extra credit assignment, I will write a program that calculates the total amount paid 
during a stock transaction. **/

public class StockCommission
{
   public static void main(String[] args)
   {
      int stock = 600;
      double sharePrice = 21.77f;
      double stockPrice;
      double commission;
      double totalPaid;
      
      stockPrice = stock * sharePrice;
      commission = stockPrice*.02;
      totalPaid = stockPrice+commission;
      
      System.out.println("You have paid $" + stockPrice + ".");
      System.out.println("The commision total made on the transaction is $" + commission + ".");
      System.out.println("You have paid $" + totalPaid + " total during this transaction.");
   }
}