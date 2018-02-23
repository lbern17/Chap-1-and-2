//assignment 5.3
//This is a program from the Peason online resources that I must complete.

/**
   You must complete this program so it calculates
   and displays the area of a rectangle.
*/

// Insert any necessary import statements here.
import java.util.Scanner;

public class AreaRectangle
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      double length = 0.0;    // The rectangle's length
      double width = 0.0;     // The rectangle's width
      double area = 0.0;      // The rectangle's area

      // Get the rectangle's length from the user.
      length = getLength();

      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   } 
      public static double getLength()
      {
         System.out.print("Give me a number to represent the length of the rectangle.");
         Scanner keyboard = new Scanner(System.in);
         double result = keyboard.nextInt();
         return result;
      }
         public static double getWidth()
         {
            System.out.print("Now give me a number to represent the width of the rectangle.");
            Scanner keyboard = new Scanner(System.in);
            double result = keyboard.nextInt();
            return result;
         }
            public static double getArea(double length, double width)
            {
               double result = length * width;
               return result;
            }
               public static void displayData(double length, double width, double area)
               {
                  System.out.println("You have a rectangle with a length of " + length + " and a"
                  + "/na width of " + width + ". Based on this data, your rectangle has an area of " + area + ".");
               }
}

