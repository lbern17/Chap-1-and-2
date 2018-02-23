//Extra Credit Assignment 3.10
/* In this extra credit assignment, I will write a program that calculates calories from fat, based
on calories and fat grams input by the user. **/
import java.util.Scanner;

public class CalsfromFat
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int cal;
      int fatGram;
      int calsfromFat;
      double fatCalsPercent;
      double totalCalsThirty;
      
      System.out.print("How many calories are in the food item in question?");
      cal = keyboard.nextInt();
      
      System.out.print("How many fat grams are in the food item in question?");
      fatGram = keyboard.nextInt();
      
      calsfromFat = fatGram*9;
      
      fatCalsPercent = calsfromFat/cal;
      
      totalCalsThirty = cal*.3;
      
      if(calsfromFat < totalCalsThirty)
      System.out.print("The percentage of calories from fat in this food item is " + fatCalsPercent + "." +
                        "\nThis food is too low in fat!");
      else if(calsfromFat >= totalCalsThirty)
      System.out.print("The percentage of calories from fat in this food item is " + fatCalsPercent + ".");
      else if(calsfromFat > cal)
      System.out.print("This is invalid! Calories from fat cannot be greater than the total calories.");      
   }
}