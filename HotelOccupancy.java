//Extra Credit Assignment 4.7
/** In this extra credit assignment, I will make a program that will use a loop to calculate the hotel
occupancy rate based on number of floors and room, based on input by the user. **/
import java.util.Scanner;

public class HotelOccupancy
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int floor = 0;
      int maxFloor =0;
      double rooms = 0;
      double totalRooms = 0;
      double roomsOcc = 0;
      double totalRoomOcc = 0;
      
      System.out.print("How many floors are in this hotel?");
      maxFloor = keyboard.nextInt();
      

      for(floor = 0; floor < maxFloor; ++floor)
      {
         
         System.out.print("How many rooms are on this floor?");
         rooms = keyboard.nextInt();
         
         totalRooms += rooms;
         
         System.out.print("How many rooms are occupied on this floor?");
         roomsOcc = keyboard.nextInt();
         
         totalRoomOcc += roomsOcc;
                  
      }
      
      double roomsVacant = totalRooms - totalRoomOcc;

      System.out.println("There are a total of " + floor + " floors in this hotel, with a total of "
      + totalRooms + " rooms,\n" + totalRoomOcc + " of which are occupied, and " + roomsVacant + " of which are vacant.");
      
      double occRate = totalRoomOcc/totalRooms;
      
      System.out.println("The room occupancy rate is " + occRate + ".");
      
      }
   }
         
         
         