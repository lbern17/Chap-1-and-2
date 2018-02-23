//assignment 5.1
//This program will be able to display a character in the string "New York" in position 2 of the string.

public class Char2Machine
{
   public static void main(String[] args)
   {
      String cityName = "New York";
      charMachine(cityName,2);
   }
   public static void charMachine(String string, int position)
   {
   char letter = string.charAt(position);
   System.out.println("The character " + letter + " is in position " + position + ".");
   }
}