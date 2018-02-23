//assignment 5.7
//This program uses methods to give an average over 5 test scores.
import java.util.Scanner;

public class averageMethodMachine
{
   public static void main(String[] args)
   {
   Scanner keyboard = new Scanner(System.in);
   int score1, score2, score3, score4, score5;
   int average;
   char letterGrade;
   
   System.out.print("Hello! Enter in the score for your first test here:");
   score1 = keyboard.nextInt();
   
   System.out.print("Now, enter in the score for your second test here:");
   score2 = keyboard.nextInt();
   
   System.out.print("Next, enter in the score for your third test here:");
   score3 = keyboard.nextInt();
   
   System.out.print("Almost there! Enter in the score for your fourth test here:");
   score4 = keyboard.nextInt();
   
   System.out.print("Last one! Enter in the score for your fifth test here:");
   score5 = keyboard.nextInt();
   
   average = calcAverage(score1, score2, score3, score4, score5);
   System.out.print("Your average test score was " + average + ".");
   
   letterGrade = determineGrade(average);
   System.out.println("You have earned a " + letterGrade + " in this class.");
   }
   public static int calcAverage(int i, int ii, int iii, int iv, int v)
   {
      return (i+ii+iii+iv+v)/5;
   }
   public static char determineGrade(int avr)
   {
    if(avr >= 90) return 'A';
    if(avr >= 80) return 'B';
    if(avr >= 70) return 'C';
    if(avr >= 60) return 'D';
    return 'F';
  }
}  