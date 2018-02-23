//4.11
//This program will show you a table of Celsius temperature read-outs, alongside their Farenheit counterparts.

public class CelsiusFahrenheit
{
   public static void main(String[] args)
   {  
      System.out.println("Fahrenheit            Celsius");
      System.out.println("_____________________________");
      for(int fah = 0 ; fah <= 20; fah++){
         double cel = celsius(fah);
         System.out.println(" " + cel + "          " + fah);}
   }
   public static double celsius(int fah)
   {
      double cel = (32-fah)*(.555);
      return cel;
   }
}