public class TestAverage
{
   private int test1;
   private int test2;
   private int test3;
   
   public TestAverage(int t1, int t2, int t3)
   {
      test1 = t1;
      test2 = t2;
      test3 = t3;
   }
   
   public void setTest1(int t1)
   {
      test1 = t1;
   }
   
   public void setTest2(int t2)
   {
      test2 = t2;
   }
   
   public void setTest3(int t3)
   {
      test3 = t3;
   }
   
   public int getTest1()
   {
      return test1;
   }
   
   public int getTest2()
   {
      return test2;
   }
  
   public int getTest3()
   {
      return test3;
   }
   public int getAverage(int t1, int t2, int t3)
   {
      int ave = (t1+t2+t3)/3;
      System.out.println("Your average is: " +ave);
      return ave;
   } 
}