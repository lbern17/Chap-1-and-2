//Extra Credit Assignment 3.7
/* In this extra credit assignment, the use will input three names, and the program
I created will sort out the names and put them in ascending order. */
import java.util.Scanner;

public class NameMachine
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String name1;
      String name2;
      String name3;
      
      System.out.println("Enter the first name here:");
      name1 = keyboard.nextLine();
      
      System.out.println("Enter the second name here:");
      name2 = keyboard.nextLine();
      
      System.out.println("Enter the third name here:");
      name3 = keyboard.nextLine();
      
      //If name1 is equal to name2...
      
      if(name1.compareTo(name2) == 0)
      {
         if(name1.compareTo(name3) == 0)
         {
            System.out.println(name1);
            System.out.println(name2);
            System.out.println(name3);
            System.out.println("All three names are the same.");

         }
         else if(name1.compareTo(name3) < 0)
         {
            System.out.println(name1);
            System.out.println(name2);
            System.out.println(name3);
         }
         else if(name1.compareTo(name3) > 0)
         {
            System.out.println(name3);
            System.out.println(name1);
            System.out.println(name2);
         }
      }
      // If name1 is less than name2...
      
      if(name1.compareTo(name2) < 0)
      {
         if(name1.compareTo(name3) == 0)
         {
            System.out.println(name2);
            System.out.println(name1);
            System.out.println(name3);
         }
         else if(name1.compareTo(name3) < 0)
         {
            if(name2.compareTo(name3) < 0)
            {
            System.out.println(name3);
            System.out.println(name2);
            System.out.println(name1);
            if(name2.compareTo(name3) > 0)
            {
            System.out.println(name2);
            System.out.println(name3);
            System.out.println(name1);
            }
            else if(name2.compareTo(name3) == 0)
            {
            System.out.println(name2);
            System.out.println(name3);
            System.out.println(name1);
            }
         }
         else if(name1.compareTo(name3) > 0)
         {  
            System.out.println(name2);
            System.out.println(name1);
            System.out.println(name3);
         }
      }
         // If name1 is greater than name2...
         if(name1.compareTo(name2) > 0)
         {
            if(name1.compareTo(name3) == 0)
            {
               System.out.println(name1);
               System.out.println(name3);
               System.out.println(name2);
            }
            else if(name1.compareTo(name3) > 0)
            {
               if(name2.compareTo(name3) > 0)
               {
                  System.out.println(name1);
                  System.out.println(name2);
                  System.out.println(name3);
               }
               else if(name2.compareTo(name3) == 0)
               {
                  System.out.println(name1);
                  System.out.println(name2);
                  System.out.println(name3);
               }
               else if(name2.compareTo(name3) < 0)
               {
                  System.out.println(name1);
                  System.out.println(name3);
                  System.out.println(name2);
               } 
         }
   }
}
}
}