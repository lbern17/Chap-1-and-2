//Extra Credit Assignment 2.3
//In this extra credit assignment, I will display personal information
//using String variables, and display them using one println line.

public class PersonalInfo
{
   public static void main(String[] args)
   {
      String name = "Lloyd J. Bernander";
      String address = "1216 7th street, Rosenberg, TX 77471";
      String phone = "(281) 232-7074";
      String major = "Computer Networking";
      
      System.out.println("Hello. My name is " + name + ". I live at " + address + ". I can be reached" +
      "\nat " + phone + ". I am majoring in " + major + ".");
   }
}