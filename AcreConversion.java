//Extra Credit Assignment 2.7
/* In this extra credit assignment, I will make a program that will calculate the number of
acres in a given tract of land. **/

public class AcreConversion
{
   public static void main(String[] args)
   {
      float acre = 43560f;
      float landSize = 389767f;
      float conversion = landSize/acre;
      
      System.out.println("If your tract of land is " + landSize + " square feet, then the number" +
      "\nof acres you own is " + conversion + ".");
   }
}