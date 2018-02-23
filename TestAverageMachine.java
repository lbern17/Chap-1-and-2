import java.util.Scanner;

public class TestAverageMachine
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int test1;
      int test2;
      int test3;
      
      System.out.print("Enter the score of the first test: ");
      test1 = keyboard.nextInt();
      
      System.out.print("Enter the score of the second test: ");
      test2 = keyboard.nextInt();
      
      System.out.print("Enter the score of the third test: ");
      test3 = keyboard.nextInt();
      
      TestScores test = new TestScores(test1, test2, test3);
      
      System.out.println(test.getAverage(test1, test2, test3));
   }
}