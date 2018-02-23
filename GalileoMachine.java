//Extra Credit Assignment 5.5

/* In this extra credit project, I will create a machine using methods that calculates the distance an
object falls over a period of time. */

public class GalileoMachine
{
   public static void main(String[] args)
   {
      int time = 0;
   
      System.out.println("Seconds                 Distance");
      System.out.println("________________________________");
      fallingDistance(time);
   }
   public static void fallingDistance(int t)
   {
      for(t = 1; t <=10; ++t)
      {
         double d = .5*(9.8*t*t);
         System.out.println(t + "                          " + d);
      }
   }
}