//Extra Credit Assignment 5.4
/*In this extra credit assignment, I will write a program using multiple methods that calculate the cost of
painting a building, using unput from the user. */
import java.util.Scanner;

public class PaintJob
{
   public static void main(String[] args)
   {
   Scanner keyboard = new Scanner(System.in);
   
   int rooms = 1;
   int maxRooms;
   int roomSQF = 0;
   int roomSQFtotal = 0;
   int paintGallon;
   int paintCost;
   int laborhours = 0;
   
   System.out.println("How many rooms will we be painting?");
   maxRooms = keyboard.nextInt();
   
      while(rooms <= maxRooms)
      {
         System.out.println("Put in the square footage of one of your rooms:");
         roomSQF = keyboard.nextInt();
         roomSQFtotal += roomSQF;
         rooms++;
      }
   System.out.print("You have " + roomSQFtotal + " square feet to paint.");
   
   System.out.println("What is the cost of the the paint you want to use, per gallon?");
   paintGallon = keyboard.nextInt();
   
   paintGallonsNeeded(roomSQFtotal);
   laborHours(roomSQFtotal);
   paintCost(paintGallon, roomSQFtotal);
   laborCharges(roomSQFtotal);
   priceOfJob(paintGallon, roomSQFtotal);
   }
   public static void paintGallonsNeeded(int sqf)
   {
      int paintNeeded = sqf/115;
      if(paintNeeded < 115)
      System.out.println("You will need 1 gallon of paint for ths job.");
      else
      System.out.println("You will need " + paintNeeded + " gallons of paint for this job.");
   }
   public static void laborHours(int sq)
   {
      int labourNeeded = sq*8;
      System.out.println("You will need " + labourNeeded + " hours of labour for this job.");
   }
   public static void paintCost(int pg, int rosqf)
   {
      int paintTotal = rosqf*pg;
      System.out.println("You will spend $" + paintTotal + " on paint for this job.");
   }
   public static void laborCharges(int sq2)
   {
      int hours = sq2*8;
      int laborCharge = hours*18;
      System.out.println("Labor costs for this job will be $" + laborCharge);
   }
   public static void priceOfJob(int pgo, int rsq2)
   {
      int paintCost = rsq2*pgo;
      int hours = rsq2*8;
      int labourCharge = hours*18;
      int totalCost = paintCost + labourCharge;
      
      System.out.println ("The grand total for this job will be $" + totalCost);
   }
}