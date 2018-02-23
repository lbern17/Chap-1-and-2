
//Name, Age, and Annual Income
public class InputInformation
{
 public static void main(String[] args)
   {
      String name;   //To hold the user's name
      int age;       //To hold the user's age
      double income; //To hold the user's income
      
      //Get the user's name.
      System.out.print("What is your name? ");
      name = keyboard.nextLine();
      
      //Get the user's age.
      System.out.print("What is your age? ");
      age = keyboard.nextInt();
      
      //Get the user's income
      System.out.print("What is your desired annual income? ");
      income = keyboard.nextDouble();
      
      //Display the information back to the user.
      System.out.println("Hello. My name is " + name + " . My age is " + age + " ,and I hope to make " + income + " dollars per year.");
    }
}