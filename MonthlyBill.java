//assignment 3.13
//This program will calculate the total monthly bill from an internet service provider based on various packages.
//Package A: $9.95 per month for first 10 hours, additional hours are $2.00 per.
//Package B: $13.95 per month for first 20 hours, additional hours are $1.0o per.
//Package C: $19.95 per month for unlimited access
import java.util.Scanner;

/**

*/

public class MonthlyBill
{
   public static void main(String[] args)
   {
      int packageType = 0;
      int hours = 0;
      double monthlyFee = 0;
      int firstHrs = 0;
      int extraHrs = 0;
      double additionalCharge = 0;
      double totalFee = 0;
      
      Scanner keyboard = new Scanner(System.in);      
      
      System.out.println("How many hours will you use the service this month? Enter in the number of hours.");
      hours = keyboard.nextInt();
      System.out.println("You will use the service for " + hours + " hours this month.");

      System.out.println("What type of package have you selected? Select [1] for package A, [2] for package B, or [3] for package C.");
      packageType = keyboard.nextInt();
      
      switch (packageType)
      {
      case 1:
      monthlyFee = 9.95;
      firstHrs = 10;
      if(hours > firstHrs);
      extraHrs = hours - firstHrs;
      additionalCharge = extraHrs * 2.00;
      totalFee = monthlyFee + additionalCharge;
      if(hours < firstHrs){
      totalFee = monthlyFee;}
      break;
      case 2:
      monthlyFee = 13.95;
      firstHrs = 20;
      if(hours > firstHrs);
      extraHrs = hours - firstHrs;
      additionalCharge = extraHrs * 1.00;
      totalFee = monthlyFee + additionalCharge;
      if(hours < firstHrs){
      totalFee = monthlyFee;}
      break;
      case 3:
      monthlyFee = 19.95;
      totalFee = monthlyFee;
      break;
      default:
      System.out.println("This is not a package type!");
      }
      System.out.println("This is package type " + packageType + ". You will use this package for " +
                         hours + " hours this month. Your regular fee is " + monthlyFee + ", and your additional charges " +
                         "will be "+ additionalCharge + ". Your total bill for this month will be " + totalFee + ".");
   }
}