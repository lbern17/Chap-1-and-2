//assignment 4.5
//This program will allow you to see how many of a particular character are in a phrase of your own creation.
import java.util.Scanner;

public class CharacterMachine
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String phrase;
      char letter;
            
      System.out.println("Hello! Tell me your favorite phrase!");
      phrase = keyboard.nextLine().toUpperCase();
      
      System.out.println("Pick a letter from the phrase you chose, and let");
      System.out.println("the magical Character Machine tell you how many times");
      System.out.println("your character showed up in the phrase!");
      letter = keyboard.next().toUpperCase().charAt(0);
      
      int letterCount = 0;
      
      for(int x= 0; x< phrase.length(); x++)
      {
      if(phrase.charAt(x)==letter)
      {
      letterCount++;
      }}
      System.out.println("Your letter appeared " + letterCount + " times in your phrase!");
   }
}