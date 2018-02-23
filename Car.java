public class Car
{
   private int yearModel;
   private String make;
   private int speed;
   
   public Car(int ym, String mk, int spd)
   {
      yearModel = ym;
      make = mk;
      speed = spd;
   }
   
   public void setYearModel(int ym)
   {
      yearModel = ym;
   }
   
   public void setMake(String mk)
   {
      make = mk;
   }
   
   public void setSpeed(int spd)
   {
      speed = spd;
      speed = 0;
   }
   
   public int getYearModel()
   {
      return yearModel;
   }
   
   public String getMake()
   {
      return make;
   }
   
   public double getSpeed()
   {
      return speed;
   }
   
   public int accelerate(int speed)
   {
      for(int x = 0; x < 5; x++)
      {
         System.out.println("Accelerating now:");
         System.out.println("Current speed is:" + speed);
         speed = speed+5;
      }
      return speed;
   }
   
   public int brake(int speed)
   {
      for(int y = 0; y < 5; y++)
      {
         System.out.println("Braking now:");
         System.out.println("Current speed is:" + speed);
         speed = speed-5;
      }
      return speed;
   }
}
      