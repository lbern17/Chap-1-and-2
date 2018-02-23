//Extra Credit Assignment 2.12
/* In this extra credit assignment, I will write a program that has the user enter in the name
of a city, then shows the user various aspects of the words used. **/
import java.util.Scanner;

public class CityName
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String cityName;
      
      System.out.println("Enter in the name of a city:");
      cityName = keyboard.nextLine();
      
      String uppercase = cityName.toUpperCase();
      String lowercase = cityName.toLowerCase();
      char letter = cityName.charAt(0);
      int length = cityName.length();
      
      System.out.println(cityName);
      System.out.println(length);
      System.out.println(uppercase);
      System.out.println(lowercase);
      System.out.println(letter);
   }
}