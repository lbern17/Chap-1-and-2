//Extra Credit Assignment 3.5
/* In this extra credit assignment, I will make a program that will convert mass into weight, measured in 
Newtons, and will make an else-if method that sorts out weights that are too heavy and too light **/
import java.util.Scanner;

public class WeightMachine
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int mass;
      double weight;
      
      System.out.print("What is the mass of the object in question?");
      mass = keyboard.nextInt();
      
      weight = mass*9.8;
      
      if(weight > 1000)
      System.out.print("The object is " + weight + " pounds. That is too heavy!");
      
      else if(weight < 1000 && weight > 10)
      System.out.print("The object is " + weight + " pounds.");
      
      else if(weight < 10)
      System.out.print("The object is " + weight + " pounds. That is too light!");
   }
}