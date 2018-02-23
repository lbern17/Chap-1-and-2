//Extra Credit Assignment 2.2
/* This is an extra credit assignment. In it, I will display my full name, 
along with my initials, by creating String and Char variables.*/

public class NameInitials
{
   public static void main(String[] args)
   {
      String firstName = "Lloyd";
      String middleName = "Jocko";
      String lastName = "Bernander";
      char firstInitial = 'L';
      char middleInitial = 'J';
      char lastInitial = 'B';
      
      System.out.println("Hello. My first name is " +firstName + ", with an initial " + firstInitial + "." +
      "\nMy middle name is " + middleName + ", with an initial " + middleInitial + ". My last name is " + lastName +
      ",\nwith an initial " + lastInitial + ".");
   }
}