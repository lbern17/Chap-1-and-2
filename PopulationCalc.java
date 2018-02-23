//Extra Credit Assignment 3.9
/* In this extra credit assignment, I will make a program that uses loops to determine the population increase
in a given species, using information provided by the user. **/
import java.util.Scanner;

public class PopulationCalc
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      double organisms;
      double dailyIncrease = 0;
      int daysMulti;
      int maxDaysMulti;
      double popIncrease = 0;
      double totalPopIncrease = 0;
      double totalPop = 0;
      
      System.out.print("How many organisms are you starting with?");
      organisms = keyboard.nextInt();
      
      System.out.print("what is the average daily increase in the population, as a percentage?");
      dailyIncrease = keyboard.nextDouble();
      
      System.out.print("How many days will these creatures reproduce?");
      maxDaysMulti = keyboard.nextInt();
      
      System.out.println("Day               Population");
      System.out.println("____________________________");
      
      for(daysMulti = 1; daysMulti <= maxDaysMulti; daysMulti++)
         {
            popIncrease=organisms*dailyIncrease;
            totalPopIncrease = popIncrease+organisms;
            totalPop += totalPopIncrease;
            System.out.println(daysMulti+"                     "+totalPop);
         }
   }
}