//assignment 2.13

//This program will allow you to get the total amount paid in a restaurant bill, including tax and tip.

//Tax will be 6.75 percent, and tip will be 15 percent.

public class RestaurantBill
{
   public static void main(String[] args)
   {
      double mealPrice = ;
      double taxAmount = mealPrice * .0675;
      double tipAmount = mealPrice * .15;
      double totalBill = mealPrice + taxAmount + tipAmount;
      
      System.out.println("If your meal at a restaurant costs " + mealPrice + ", then the tax amount would be " + taxAmount + ", the tip amount would be " + tipAmount + ", and the total amount you would pay would be " + totalBill + ".");
   }
}