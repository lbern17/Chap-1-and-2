//Assignment 8.2

public class PayRoll
{     
   private String[] employeeID;
   private double[] hours;
   private double[] payRate;
      
   public PayRoll()
   {
      employeeID = new String[] {"5658845", "4520125", "7895122", "8777541", "8451277", "1302850", "7580489"};
      hours = new double[7];
      payRate = new double[7];
   }
   public String[] getID()
   {
      return employeeID;
   }
   public void setHours(double[] hrs)
   {
      hours=hrs;
   }
   public double[] getHours()
   {
      return hours;
   }
   public void setPayRate(double[] pr)
   {
      payRate=pr;
   }
   public double[] getPayRate()
   {
      return payRate;
   }
   public double getWages(String eid)
   {
      int index=0;
      for(int x=0; x<employeeID.length; x++)
      {
         if(eid.equalsIgnoreCase (employeeID[x]))
         {
         index=x;
         break;
         }
      }
    return hours[index]*payRate[index];
   }
}

 