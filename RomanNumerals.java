//assignment 3.1

//This program will convert a number from 1-10 into a Roman numeral.

import java.util.Scanner;

/**

*/

public class RomanNumerals
{
   public static void main(String[] args)
   {
   int num;
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Pick a number betweel 1 and 10! The magical numbers converter will");
   System.out.println("turn your chosen number into a ROMAN NUMERAL!");
   num = keyboard.nextInt();
   
   switch (num){
   
      case 1:
         System.out.println("The Roman Numeral for 1 is I.");
         break;
      case 2:
         System.out.println("The Roman Numeral for 2 is II.");
         break;
      case 3:
         System.out.println("The Roman Numeral for 3 is III.");
         break;
      case 4:
         System.out.println("The Roman Numeral for 4 is IV.");
         break;
      case 5:
         System.out.println("The Roman Numeral for 5 is V.");
         break;
      case 6:
         System.out.println("The Roman Numeral for 6 is VI.");
         break;
      case 7:
         System.out.println("The Roman Numeral for 7 is VII.");
         break;
      case 8:
         System.out.println("The Roman Numeral for 8 is VIII.");
         break;
      case 9:
         System.out.println("The Roman Numeral for 9 is IX.");
         break;
      case 10:
         System.out.println("The Roman Numeral for 10 is X.");
         break;
      default:
         System.out.println("That is not a number between 1 and 10!");
               }
    }
}
