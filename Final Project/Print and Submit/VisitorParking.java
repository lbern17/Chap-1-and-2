import java.util.Scanner;

public class VisitorParking
{
   public static void main(String[] args)
   {
   mainmenu();
   }
   public static void mainmenu()
   {
      Scanner key = new Scanner(System.in);
      
      char menu;
      
      System.out.println(" Welcome to Wharton County Junior College Visitor Parking!");
      System.out.println("How can I help you? Select an option. Enter the first letter");
      System.out.println("     of the option you would like, then press ENTER.");
      System.out.println("  ");
      System.out.println("Help        Cars        Motorcycles        Senior Citizens        Quit");
      
      menu = key.nextLine().toUpperCase().charAt(0);
      
      switch(menu)
      {
      
      case 'H':
      help();
      break;
   
      case 'C':
      cars();
      break;
      
      case 'M':
      motorcycles();
      break;
      
      case 'S':
      seniors();
      break;
      
      case 'Q':
      quit();
      break;
      
      default:
      System.out.println("This is not a valid selection! Select an option from the menu");
      System.out.println("by entering in the first letter of that option.");
      System.out.println("   ");
      mainmenu();
      break;
      
      }
   }
   public static void help()
   {
      Scanner key = new Scanner(System.in);
      
      String menu;
      
      for(int i=0; i<=15; i++)
      {
      System.out.println("   ");
      }
      System.out.println("You have selected HELP.");
      System.out.println("   ");
      System.out.println("This parking lot is a pay-per-hour lot. The fee you pay upon exit is dependant");
      System.out.println("on the number of hours you park. To calculate your total cost, Select CAR if you");
      System.out.println("drive a car or truck, or MOTORCYCLE if you are driving a motorcycle. If you are");
      System.out.println("a senior citizen, select the SENIOR CITIZEN option to receive the senior rate. Once");
      System.out.println("you have selected an option, enter in the number of minutes you have parked. The program");
      System.out.println("will calculate your total cost of parking. Here are a list of fees per vehicle type:");
      System.out.println("                             WCJC VISITORS PARKING                                     ");
      System.out.println("_______________________________________________________________________________________");
      System.out.println("                                     CARS                                              ");
      System.out.println("             First (1) Hour:                              Free                         ");
      System.out.println("             Next Two (2) Hours:                          $2.00 per hour               ");
      System.out.println("             Next Five (5) Hours:                         $1.00 per hour               ");
      System.out.println("             Thereafter:                                  $.50 per hour (more than 8 hours");
      System.out.println("                                   MOTORCYCLES                                         ");
      System.out.println("             First (1) Hour:                              $1.00 per hour               ");
      System.out.println("             Next Five (5) Hours:                         $0.50 per hour               ");
      System.out.println("             Next Eight (8) Hours:                        $0.25 per hour               ");
      System.out.println("             Thereafter:                                  $0.10 per hour (more than 14 hours)");
      System.out.println("                                 SENIOR CITIZENS                                       ");
      System.out.println("                                  Free All Day                                         ");
      System.out.println("Press Any Key to Return to the Previous Menu:");
      menu = key.nextLine();
      for(int i=0; i<=15; i++)
      {
      System.out.println("   ");
      }
      mainmenu();  
   }
   public static void cars()
   {
      Scanner key = new Scanner(System.in);
      
      String main;
      int time;
      int hours;
      double charge;
      double totalFee;
      
      for(int i=0; i<=15; i++)
      {
      System.out.println("   ");
      }
      System.out.println("You have selected CARS");
      System.out.println("   ");
      System.out.println("Enter in the total number of minutes you have parked your car in the lot.");
      time = key.nextInt();
      System.out.println("You have spent " + time + " minutes in this lot.");
      
      key.nextLine();
      
      if(time<=60)
      {
         System.out.println("Your total fee today is $0.00.");
         System.out.println("Press any key to return to the main menu");
         main = key.nextLine();
         for(int i=0; i<=15; i++)
         {
         System.out.println("   ");
         }
         mainmenu();
      }
      else if(time>60 && time <180)
      {
         hours = time/60;
         charge = 2.00;
         totalFee = charge*hours;
         System.out.println("Your total fee for parking is $" + totalFee);
         System.out.println("Press any key to return to the main menu");
         main = key.nextLine();
         for(int i=0; i<=15; i++)
         {
         System.out.println("   ");
         }
         mainmenu();
      }
      else if(time>=180 && time<480)
      {
         hours = (time/60)-3;
         charge = 1.00;
         totalFee = charge*hours+4.00;
         System.out.println("Your total fee for parking is $" + totalFee);
         System.out.println("Press any key to return to the main menu");
         main = key.nextLine();
         for(int i=0; i<=15; i++)
         {
         System.out.println("   ");
         }
         mainmenu();
      }
      else if(time>=480)
      {  
         hours = (time/60)-8;
         charge = .50;
         totalFee = charge*hours+9.00;
         System.out.println("Your total fee for parking is $" + totalFee);
         System.out.println("Press any key to return to the main menu");
         main = key.nextLine();
         for(int i=0; i<=15; i++)
         {
         System.out.println("   ");
         }
         mainmenu();
      }
   }
   public static void motorcycles()
   {
      Scanner key = new Scanner(System.in);
      String main;
      int time;
      int hours;
      double charge;
      double totalFee;
      
      for(int i=0; i<=15; i++)
      {
      System.out.println("   ");
      }
      System.out.println("You have selected MOTORCYCLES");
      System.out.println("   ");
      System.out.println("Enter in the total number of minutes you have parked your motorcycle in the lot.");
      time = key.nextInt();
      System.out.println("You have spent " + time + " minutes in this lot.");
      
      key.nextLine();
      
      if(time<=60)
      {
         System.out.println("Your total fee today is $1.00.");
         System.out.println("Press any key to return to the main menu");
         main = key.nextLine();
         for(int i=0; i<=15; i++)
         {
         System.out.println("   ");
         }
         mainmenu();
      }
      else if(time>60 && time <360)
      {
         hours = time/60;
         charge = 0.50;
         totalFee = charge*hours+1.00;
         System.out.println("Your total fee for parking is $" + totalFee);
         System.out.println("Press any key to return to the main menu");
         main = key.nextLine();
         for(int i=0; i<=15; i++)
         {
         System.out.println("   ");
         }
         mainmenu();
      }
      else if(time>=360 && time<840)
      {
         hours = (time/60)-6;
         charge = 0.25;
         totalFee = charge*hours+3.50;
         System.out.println("Your total fee for parking is $" + totalFee);
         System.out.println("Press any key to return to the main menu");
         main = key.nextLine();
         for(int i=0; i<=15; i++)
         {
         System.out.println("   ");
         }
         mainmenu();
      }
      else if(time>=840)
      {  
         hours = (time/60)-14;
         charge = .10;
         totalFee = charge*hours+5.50;
         System.out.println("Your total fee for parking is $" + totalFee);
         System.out.println("Press any key to return to the main menu");
         main = key.nextLine();
         for(int i=0; i<=15; i++)
         {
         System.out.println("   ");
         }
         mainmenu();
      }
   }
   public static void seniors()
   {
      Scanner key = new Scanner(System.in);
      int time;
      String main;
      
      for(int i=0; i<=15; i++)
      {
      System.out.println("   ");
      }
      System.out.println("You have selected SENIOR CITIZENS");
      System.out.println("   ");
      System.out.println("Enter in the total number of minutes you have parked your motorcycle in the lot.");
      time = key.nextInt();
      key.nextLine();
      System.out.println("You have spent " + time + " minutes in this lot.");
      System.out.println("Your total charge is $0.00.");
      System.out.println("Press any key to return to the main menu.");
      main = key.nextLine();
      for(int i=0; i<=15; i++)
      {
      System.out.println("   ");
      }
      mainmenu();
   }
   public static void quit()
   {
      for(int i=0; i<=15; i++)
      {
      System.out.println("   ");
      }
      System.out.println("Thank you! See you again soon!");
   }
}
