//Extra Credit Assignment 2.15
/* In this extra credit assignment, I will make a program that gives the number of people who voted certain
ways based on percentages given in a survey on Energy Drinks. **/

public class EnergyDrinks
{
   public static void main(String[] args)
   {
      int people = 12467;
      double oneDrinkPerWeek;
      double citrus;
      
      oneDrinkPerWeek = .14*12467;
      citrus = oneDrinkPerWeek*.64;
      
      System.out.println("In a survey of " + people + " people, " + oneDrinkPerWeek + " people said they" +
      "\npurchase one or more drink per week. Of those people, " + citrus + " people say they prefer citrus flavors.");
   }
}