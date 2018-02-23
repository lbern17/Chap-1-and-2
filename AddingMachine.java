//assignment 4.1
//This program will use a loop to find the sum of the numbers from 1 to the number entered.
import java.util.Scanner;

public class AddingMachine
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Hey! Pick a positive number, and be amazed as the Adding Machine gives you a sum!");
      int num = keyboard.nextInt();
      while(num<0)
      {
         System.out.println("You just picked a negative number. You shouldn't have done that...");
         num = keyboard.nextInt();
         }
            int totalSum = 0;
            for(int i = 1; i <= num; i++)
         {
            totalSum += i;
         }
            System.out.println("And now, the total sum of your number: " + totalSum);
         }
      }
