//assignment 2.8

//This is a program that can give the use the total price of an item. The user enters in an amount, and the program will enter in the state and county taxes, thus giving a total amount.

//State tax is assumed at 4 percent. County tax is assumed at 2 percent.

public class SalesTax
{
   public static void main(String[] args)
   {
      double regularPrice = 16.99;
      double stateTax = regularPrice * 0.04;
      double countyTax = regularPrice * 0.02;
      double totalSalesTax = stateTax + countyTax;
      double totalSale = regularPrice + totalSalesTax;
      
      System.out.println("If the price of an item is " + regularPrice + ", then the state tax on the item would be " + stateTax + ", the county tax on the item would be " + countyTax + ", the total sales tax on the item would be " + totalSalesTax + ", and the total amount paid for the item would be " +totalSale + ".");
      }
  }