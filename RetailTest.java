public class RetailTest
{
   public static void main(String[] args)
   {
      String description;
      int unitsonHand;
      double price;
      
      RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
      RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
      RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
      
      System.out.println("Item         Description           Units on Hand          Price");
      System.out.println("_______________________________________________________________");
      System.out.println("Item # 1      " + item1.getDescription() + "                     " + item1.getUnitsonHand() + "               " + item1.getPrice());
      System.out.println("Item # 2      " + item2.getDescription() + "             " + item2.getUnitsonHand() + "               " + item2.getPrice());
      System.out.println("Item # 3      " + item3.getDescription() + "                      " + item3.getUnitsonHand() + "               " + item3.getPrice());
   }
}