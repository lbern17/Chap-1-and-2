//Extra Credit Assignment 2.16
/* In this extra credit assignment, I will make a program that works as a word game, with the user entering
in data, and a string being created based on the data input. **/  
import java.util.Scanner;

public class WordGame
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String name;
      int age;
      String city;
      String college;
      String profession;
      String animal;
      String namePet;
      
      System.out.println("Enter your name:");
      name = keyboard.nextLine();
      
      System.out.println("Enter your city:");
      city = keyboard.nextLine();
      
      System.out.println("Enter the college you attend:");
      college = keyboard.nextLine();
      
      System.out.println("Enter your profession:");
      profession = keyboard.nextLine();
      
      System.out.println("Enter a pet you would like to have:");
      animal = keyboard.nextLine();
      
      System.out.println("Enter the name you would most likely give to this animal:");
      namePet = keyboard.nextLine();
      
      System.out.println("Enter your age:");
      age = keyboard.nextInt();
      
      System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name +
      "\nwent to college at " + college + ". " + name + " graduated and went to work ar a " + profession + ". Then, " + name +
      "\nadopted a(n) " + animal + " named " + namePet + ". They both lived happily ever after!");
   }
}