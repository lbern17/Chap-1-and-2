import java.util.Scanner;

public class CarTest
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int yearModel;
      String make;
      int speed;
            
      System.out.print("Enter the make of the car: ");
      make = keyboard.nextLine();
      
      System.out.print("Enter the year of the car: ");
      yearModel = keyboard.nextInt();
      
      System.out.print("Enter the speed of the car: ");
      speed = keyboard.nextInt();
      
      Car newcar = new Car(yearModel, make, speed);

      System.out.println();
      System.out.println("Status of Your Car:");
      System.out.println("Year of Car: " + newcar.getYearModel());
      System.out.println("Make: " + newcar.getMake());
      System.out.println("Speed: " + newcar.getSpeed());
      
      System.out.println("\nAcceleration Test:");
            System.out.println(newcar.accelerate(speed));

      
      System.out.println("Brake Test:");
            System.out.println(newcar.brake(speed));
         }
   }
