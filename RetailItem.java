public class RetailItem
{
   private String description;
   private int unitsonHand;
   private double price;
   
   public RetailItem(String d, int uh, double p)
   {
      description = d;
      unitsonHand = uh;
      price = p;
   }
   
   public void setDescription(String d)
   {
      description = d;
   }
   
   public void setUnitsonHand(int uh)
   {
      unitsonHand = uh;
   }
   
   public void setPrice(double p)
   {
      price = p;
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public int getUnitsonHand()
   {
      return unitsonHand;
   }
   
   public double getPrice()
   {
      return price;
   }
}
      