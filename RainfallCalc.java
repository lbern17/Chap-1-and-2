//Extra Credit Assignment 3.8

/* In this extra credit assignment, I will make a program that uses loops to calculate the average rainfall
over a period of years, as determined by the user. **/
import java.util.Scanner;

public class RainfallCalc
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int years;
      int maxYears;
      int months;
      int maxMonths = 12;
      int totalMonths = 0;
      int rainfall = 0;
      int totalRainfall = 0;
      int aveRainfall;
      
      System.out.print("How many years have passed?");
      maxYears = keyboard.nextInt();
      
      for(years = 1; years <= maxYears; ++years)
      {
         for(months = 1; months <= maxMonths; months++)
         {
            System.out.print("How many inches of rainfall occured in this month?");
            rainfall = keyboard.nextInt();
            
            totalRainfall += rainfall;
          }
       }
      
       totalMonths = maxYears*12;
       aveRainfall = totalRainfall/totalMonths;
       
       System.out.println("Based on the information provided, over the course of " + totalMonths + " months, about " + totalRainfall +
       "\noccured in this region, which is about " + aveRainfall + " percent average rainfall for the entire period.");
    }
 }
       