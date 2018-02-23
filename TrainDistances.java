//Extra Credit Assignment 4.2
/* In this extra credit assignment, I will create a loop program to figure out the distance a train has
traveled, based on information the use inputs. **/
import java.util.Scanner;
import java.io.*;

public class TrainDistances
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      
      int hour;
      int speed;
      int distance;
      int maxHour;
      String file;
      
      System.out.println("How many hours have you traveled?");
      maxHour = keyboard.nextInt();
      
      System.out.println("At what speed has the train been traveling?");
      speed = keyboard.nextInt();
      
      System.out.println("Enter the name of the file you want to save this info to:");
      file = keyboard.nextLine();
      
      PrintWriter outputFile = new PrintWriter(file);
      
      System.out.println("Hour                 Distance");
      System.out.println("_____________________________");
      
      for(hour = 1; hour <= maxHour; ++hour)
      {
         System.out.println(hour + "                    " + hour*speed);
      }
      
      outputFile.close();
      System.out.print("Data has been saved to file.");
   }
}