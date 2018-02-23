//Assignment 8.1

public class RainFall
{     
   private double[] rainfall;
   private double totalRain;
   private double aveRain;
   private double highest;
   private double lowest;
      
   public RainFall(double[] rf)
   {
      rainfall = rf;   
  }
  public double getLowest()
  {
      lowest=rainfall[0];
      
      for (int index = 0; index < rainfall.length; index++)
         {  
         if(rainfall[index] < lowest)
            lowest = rainfall[index];
         }
      return lowest;
       
         
  }
  public double getHighest()
  {  
    highest=rainfall[0];
      
      for (int index = 0; index < rainfall.length; index++)
         {  
         if(rainfall[index] > highest)
            highest = rainfall[index];
         }
      return highest;
  }
  public double getTotalRain()
  {
     totalRain = rainfall[0]+rainfall[1]+rainfall[2]+rainfall[3]+rainfall[4]+rainfall[5]+rainfall[6]+
     rainfall[7]+rainfall[8]+rainfall[9]+rainfall[10]+rainfall[11];
     return totalRain;
  }
  public double getAveRain()
  {   
     aveRain = totalRain/12;
     return aveRain;
  }   
}