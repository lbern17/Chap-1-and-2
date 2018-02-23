//Assignment 8.1
import java.util.Scanner;

public class RainFallDemo
{
   public static void main(String[] args)
   {
     Scanner key = new Scanner(System.in);
     
     final int MONTHS = 12;
     double[] rainfall = new double[MONTHS];
      
     for(int index = 0; index < MONTHS; index++)
      {
         System.out.println("What is the rainfall amount for month " + (index+1) + "?");
         rainfall[index] = key.nextDouble();
         if(rainfall[index]<0)
         {
         System.out.println("This is not a valid rainfall amount! Enter a positive rainfall amount for this month.");
         rainfall[index] = key.nextDouble();
         }
      }
      
      RainFall rain = new RainFall(rainfall);
      System.out.println("The total rainfall in this region for the year is: " + rain.getTotalRain());
      System.out.println("The average rainfall in this region for the year is: " + rain.getAveRain());
      System.out.println("The highest recorded monthly rainfall this year is: " + rain.getHighest());
      System.out.println("The lowest recorded monthly rainfall this yeat is: " + rain.getLowest());
    }
 }  
      