//Extra Credit Assignment 3.3
/* In this extra credit assignment, I will use a if-else-if method to calculate the user's BMI based on
information provided by the user. **/
import java.util.Scanner;

public class BMImachine
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int weight;
      int height;
      int BMI;
      
      System.out.print("Type in your weight here:");
      weight = keyboard.nextInt();
      
      System.out.print("Type in your height, in inches, here:");
      height = keyboard.nextInt();
      
      BMI = (weight*703)/(height*height);
      
      if(BMI < 18.5)
      System.out.print("Your BMI is " + BMI + ". Based on this information, you are underweight.");
      
      else if(BMI > 18.5 && BMI < 25)
      System.out.print("Your BMI is " + BMI + ". Based on this information, you are at optimal weight.");
      
      else if(BMI > 25)
      System.out.print("Your BMI is " + BMI + ". Based on this information, you are overweight.");
   }
}