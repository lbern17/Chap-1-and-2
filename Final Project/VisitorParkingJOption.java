/* Final Project- For this project, I am to create a visitor parking program, wherein the user makes
choices via a menu, inputs data, and recieves a total for how much they pay for parking. */

import javax.swing.JOptionPane;

public class VisitorParkingJOption
{
   public static void main(String[] args)
  {
   mainmenu();
   }
   public static void mainmenu()
   {  
      String menu;
      
      menu=JOptionPane.showInputDialog("    Welcome to Wharton County Junior College Visitor Parking!"+
      "\nSelect an option. Enter the first letter of the option you would like," +
      "\n                                       then press ENTER."+
      "\n   "+
      "Help     Cars        Motorcycles           Senior Citizens             Quit");
      
      menu = menu.toUpperCase();
      
      switch(menu)
      {
      
      case "H":
      help();
      break;
   
      case "C":
      cars();
      break;
      
      case "M":
      motorcycles();
      break;
      
      case "S":
      seniors();
      break;
      
      case "Q":
      quit();
      break;
      
      default:
      JOptionPane.showMessageDialog(null,"That is not a valid option! Select a valid option" +
      "\nand enter the first letter of the word.");
      mainmenu();
      break;
   }
   }
   public static void help()
   {
      
      String menu;
      
      JOptionPane.showMessageDialog(null,"You have selected HELP.");
      JOptionPane.showInputDialog("This parking lot is a pay-per-hour lot. The fee you pay upon exit is dependant"+
      "\non the number of hours you park. To calculate your total cost, Select CAR if you"+
      "\ndrive a car or truck, or MOTORCYCLE if you are driving a motorcycle. If you are"+
      "\na senior citizen, select the SENIOR CITIZEN option to receive the senior rate. Once"+
      "\nyou have selected an option, enter in the number of minutes you have parked. The program"+
      "\nwill calculate your total cost of parking. Here are a list of fees per vehicle type:"+
      "\n                                         WCJC VISITORS PARKING                                     "+
      "\n____________________________________________________________________"+
      "\n                                     CARS                                              "+
      "\n             First (1) Hour:                              Free                         "+
      "\n             Next Two (2) Hours:                          $2.00 per hour               "+
      "\n             Next Five (5) Hours:                         $1.00 per hour               "+
      "\n             Thereafter:                                  $.50 per hour (more than 8 hours)"+
      "\n                                   MOTORCYCLES                                         "+
      "\n             First (1) Hour:                              $1.00 per hour               "+
      "\n             Next Five (5) Hours:                         $0.50 per hour               "+
      "\n             Next Eight (8) Hours:                        $0.25 per hour               "+
      "\n             Thereafter:                                  $0.10 per hour (more than 14 hours)"+
      "\n                                 SENIOR CITIZENS                                       "+
      "\n                                  Free All Day                                         "+
      "\nPress Any Key to Return to the Previous Menu:");
      mainmenu();  
   }
   public static void cars()
   {
      
      String main;
      String time;
      int hours;
      int hour;
      double charge;
      double totalFee;
      
      JOptionPane.showMessageDialog(null,"You have selected CARS");
      time=JOptionPane.showInputDialog("Enter in the total number of minutes you have parked your car in the lot.");
      JOptionPane.showMessageDialog(null,"You have spent " + time + " minutes in this lot.");
      
      hour=Integer.parseInt(time);
      
      if(hour<=60)
      {
         main=JOptionPane.showInputDialog("Your total fee today is $0.00."+
         "\nPress any key to return to the main menu");
         mainmenu();
      }
      else if(hour>60 && hour<180)
      {
         hours = hour/60;
         charge = 2.00;
         totalFee = charge*hours;
         JOptionPane.showInputDialog("Your total fee for parking is $" + totalFee +"." +
         "\nPress any key to return to the main menu");
         mainmenu();
      }
      else if(hour>=180 && hour<480)
      {
         hours = (hour/60)-3;
         charge = 1.00;
         totalFee = charge*hours+4.00;
         JOptionPane.showInputDialog("Your total fee for parking is $" + totalFee + "." +
         "\nPress any key to return to the main menu");
         mainmenu();
      }
      else if(hour>=480)
      {  
         hours = (hour/60)-8;
         charge = .50;
         totalFee = charge*hours+9.00;
         JOptionPane.showInputDialog("Your total fee for parking is $" + totalFee + "." +
         "\nPress any key to return to the main menu");
         mainmenu();
      }
   }
    public static void motorcycles()
   {
      String main;
      String time;
      int hour;
      int hours;
      double charge;
      double totalFee;
      
      JOptionPane.showMessageDialog(null,"You have selected MOTORCYCLES");
      time=JOptionPane.showInputDialog("Enter in the total number of minutes you have parked your motorcycle in the lot.");
      hour = Integer.parseInt(time);
      JOptionPane.showMessageDialog(null,"You have spent " + time + " minutes in this lot.");
      
      if(hour<=60)
      {
         main=JOptionPane.showInputDialog("Your total fee today is $1.00." +
         "\nPress any key to return to the main menu");
         mainmenu();
      }
      else if(hour>60 && hour<360)
      {
         hours = hour/60;
         charge = 0.50;
         totalFee = charge*hours+1.00;
         main=JOptionPane.showInputDialog("Your total fee for parking is $" + totalFee +
         "\nPress any key to return to the main menu");
         mainmenu();
      }
      else if(hour>=360 && hour<840)
      {
         hours = (hour/60)-6;
         charge = 0.25;
         totalFee = charge*hours+3.50;
         main=JOptionPane.showInputDialog("Your total fee for parking is $" + totalFee +
         "\nPress any key to return to the main menu");
         mainmenu();
      }
      else if(hour>=840)
      {  
         hours = (hour/60)-14;
         charge = .10;
         totalFee = charge*hours+5.50;
         main=JOptionPane.showInputDialog("Your total fee for parking is $" + totalFee +
         "\nPress any key to return to the main menu");
         mainmenu();
      }
   }
   public static void seniors()
   {
      String time;
      String main;
      
      JOptionPane.showMessageDialog(null,"You have selected SENIOR CITIZENS");
      time=JOptionPane.showInputDialog("Enter in the total number of minutes you have parked your car or motorcycle in the lot.");
      JOptionPane.showMessageDialog(null,"You have spent " + time + " minutes in this lot.");
      main=JOptionPane.showInputDialog("Your total charge is $0.00." + "\nPress any key to return to the main menu.");
      mainmenu();
   }
   public static void quit()
   {
      JOptionPane.showMessageDialog(null,"Thank you! See you again soon!");
   }
}

  