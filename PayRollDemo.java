//Assignment 8.2
import java.util.Scanner;

public class PayRollDemo
{
   public static void main(String[] args)
   {
     Scanner key = new Scanner(System.in);
 
     PayRoll pr = new PayRoll();
            
     String[]eid=pr.getID();
     
     double[] h= new double [eid.length];
     
         for(int i=0; i<eid.length; i++)
         {
         System.out.println("Enter the hours worked by employee # " + eid[i]);
         h[i] = key.nextInt();
         }
     
     pr.setHours(h);
      
     double[] payr= new double[eid.length];
      
         for(int i=0; i<eid.length; i++)
         {
         System.out.println("Enter the payrate worked by employee # " + eid[i]);
         payr[i] = key.nextDouble();
         }
      pr.setPayRate(payr);
      
      for(int i=0; i<eid.length; i++)
         {
         System.out.println("The gross wages for employee # " + eid[i] + " are $" + pr.getWages(eid[i]));
         }
      }
}