// Extra Credit Assignment 5.9
/* In this extra credit assignment, I will create a program that calculates the distance an object has
traveled, based on the speed at which it is traveling, and the time it takes to travel. */
import java.util.Scanner;

public class DistanceClass
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int speed;
      int time;
      int maxTime;
   
      System.out.println("How fast are you traveling?");
      speed = keyboard.nextInt();
      
      System.out.println("How much time, in hours, did it take for you to get where you were going?");
      maxTime = keyboard.nextInt();
      
      System.out.println("Time                Distance Traveled");
      System.out.println("_____________________________________");
      
      distance(speed, maxTime);
   }
      public static void distance(int s, int mt)
      {
         for(int t = 1; t <= mt; ++t)
         {
            int d = s*t;
            System.out.println(t + "                        " + d);
         }
      }
}