//Assignment 8.1

import java.util.Scanner;

public class RainfallArray
{
   public static void main(String[] args)
   {
      Scanner key = new Scanner(System.in);
      
      final int months = 12;
      double[] rainfall = new double[months];
      double totalRain;
      double aveRain;
      double highest;
      double lowest;
      
      for(int index = 0; index < months; index++)
      {
         System.out.println("What is the rainfall amount for month " + (index+1) + "?");
         rainfall[index] = key.nextDouble();
      }
     
      lowest=rainfall[0];
      
      for (int index = 0; index < rainfall.length; index++)
         {  
         if(rainfall[index] < lowest)
            lowest = rainfall[index];
         }
    
    highest=rainfall[0];
      
      for (int index = 0; index < rainfall.length; index++)
         {  
         if(rainfall[index] > highest)
            highest = rainfall[index];
         }
    
     totalRain = rainfall[0]+rainfall[1]+rainfall[2]+rainfall[3]+rainfall[4]+rainfall[5]+rainfall[6]+
     rainfall[7]+rainfall[8]+rainfall[9]+rainfall[10]+rainfall[11];
     
     aveRain = totalRain/12;
     
     System.out.println("The total rainfall in this region for the year is: " + totalRain);
     System.out.println("The average monthly rainfall in this region for the year is: " + aveRain);
     System.out.println("The highest monthly rainfall this year is: " + highest);
     System.out.println("The lowest monthly rainfall this year is: " + lowest);
   }
}