//Extra Credit Assignment 3.9
/* In this Extra Credit Assignment, I will make a program that calculate shipping costs per
500 miles, based on information the user inputs. **/
import java.util.Scanner;

public class ShippingCostMachine
{
   public static void main(String[] args)
      {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the weight of the package you are shipping, to the nearest pound:");
      int weight = keyboard.nextInt();
      
      System.out.print("Enter the number of miles you have traveled, to the nearest mile:");
      int miles = keyboard.nextInt();
      
      double milesPer = 0;
      double charges = miles*milesPer;
            
      if(weight <= 2)
      {milesPer = 1.10;
      charges = miles*milesPer;
      System.out.println("The shipping charges for this package would be $1.10 per 500 miles." +
                          " Your shipping charges would be "+ charges);
                          }     
      if(weight > 2 && weight <= 6)
      {
      milesPer = 2.20;
      charges = miles*milesPer;
      System.out.println("The shipping charges for this package would be $2.20 per 500 miles."+
                          " Your shipping charges would be " + charges);
      }
      else if(weight > 6 && weight <= 10)
      {
      milesPer = 3.70;
      charges = miles*milesPer;
      System.out.println("The shipping charges for this package would be $3.70 per 500 miles."+
                          " Your shipping charges would be " + charges);
      }
      else if(weight > 10)
      {
      milesPer = 3.80;
      charges = miles*milesPer;
      System.out.println("The shipping charges for this package would be $3.80 per 500 miles."+
                          " Your shipping charges would be " + charges);
      }
   }
}