import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class VisitorParkingWindow extends JFrame
{
   private JPanel panel;
   private JLabel messageLabel;
   private JLabel messageLabel2;
   private JLabel messageLabel3;
   private JLabel messageLabel4;
   private JTextField hours;
   private JTextField fee;
   private JRadioButton HelpButton;
   private JRadioButton CarButton;
   private JRadioButton MCButton;
   private JRadioButton SeniorButton;
   private JRadioButton QuitButton;
   private ButtonGroup WCJCButtonGroup;
   private final int WINDOW_WIDTH = 600;
   private final int WINDOW_HEIGHT = 150;

   public VisitorParkingWindow()
   {
      setTitle("WCJC Visitor Parking Services");

      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      buildPanel();

      add(panel);

      setVisible(true);
   }

   private void buildPanel()
   {
      messageLabel = new JLabel("Welcome to WCJC Visitor Parking Services!");
      messageLabel2 = new JLabel( "Enter the number of hours you have parked in the lot.");
      messageLabel3 = new JLabel("Then, click on one of the options below to get your total fee for parking.");
      messageLabel4 = new JLabel("For help with using this program, click on the HELP option. When finished, click on the QUIT option.");
      hours = new JTextField(5);
      fee = new JTextField(8); 
      HelpButton = new JRadioButton("Help");
      CarButton = new JRadioButton("Cars");
      MCButton = new JRadioButton("Motorcycles");
      SeniorButton = new JRadioButton("Senior Citizens");
      QuitButton = new JRadioButton("Quit");

      WCJCButtonGroup = new ButtonGroup();
      WCJCButtonGroup.add(HelpButton);
      WCJCButtonGroup.add(CarButton);
      WCJCButtonGroup.add(MCButton);
      WCJCButtonGroup.add(SeniorButton);
      WCJCButtonGroup.add(QuitButton);

      HelpButton.addActionListener(new WCJCButtonListener());
      CarButton.addActionListener(new WCJCButtonListener());
      MCButton.addActionListener(new WCJCButtonListener());
      SeniorButton.addActionListener(new WCJCButtonListener());
      QuitButton.addActionListener(new WCJCButtonListener());

      panel = new JPanel();
      panel.add(messageLabel);
      panel.add(messageLabel2);
      panel.add(messageLabel3);
      panel.add(messageLabel4);
      panel.add(hours);
      panel.add(fee);
      panel.add(HelpButton);
      panel.add(CarButton);
      panel.add(MCButton);
      panel.add(SeniorButton);
      panel.add(QuitButton);
   }

   private class WCJCButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == HelpButton)
         {
            JOptionPane.showMessageDialog(null,"You have selected HELP.");
      JOptionPane.showMessageDialog(null,"This parking lot is a pay-per-hour lot. The fee you pay upon exit is dependant"+
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
      "\n             Thereafter:                                  $.50 per hour (more than 8 hours"+
      "\n                                   MOTORCYCLES                                         "+
      "\n             First (1) Hour:                              $1.00 per hour               "+
      "\n             Next Five (5) Hours:                         $0.50 per hour               "+
      "\n             Next Eight (8) Hours:                        $0.25 per hour               "+
      "\n             Thereafter:                                  $0.10 per hour (more than 14 hours)"+
      "\n                                 SENIOR CITIZENS                                       "+
      "\n                                  Free All Day                                         "+
      "\nPress the OK button to return to the main menu.");
         }
         else if (e.getSource() == CarButton)
         {
            String hours;
            String fee;
            int time;
            int hour;
            double charge;
            double totalFee;
            
            hours = hours.getText();
      
            JOptionPane.showMessageDialog(null,"You have selected CARS");
            hour=Integer.parseInt(hours);
      
            if(time<=60)
            {
               totalfee=0.00;
               totalfee= fee.setText();
            }
            else if(time>60 && time<180)
            {
               hours = hour/60;
               charge = 2.00;
               totalFee = charge*hours;
               JOptionPane.showMessageDialog(null,"Your total fee for parking is $" + totalFee +"." +
               "\nPress the OK button to return to the main menu");
            }
            else if(hour>=180 && hour<480)
            {
               hours = (hour/60)-3;
               charge = 1.00;
               totalFee = charge*hours+4.00;
               JOptionPane.showInputDialog(null,"Your total fee for parking is $" + totalFee + "." +
               "\nPress any key to return to the main menu");
            }
            else if(hour>=480)
            {  
               hours = (hour/60)-8;
               charge = .50;
               totalFee = charge*hours+9.00;
               JOptionPane.showMessageDialog(null,"Your total fee for parking is $" + totalFee + "." +
               "\nPress the OK button to return to the main menu");
            }
            }
            else if (e.getSource() == MCButton)
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
      
            if(hour<=60)
            {
               JOptionPane.showMessageDialog(null,"Your total fee today is $1.00." +
               "\nPress any key to return to the main menu");
            }
            else if(hour>60 && hour<360)
            {
               hours = hour/60;
               charge = 0.50;
               totalFee = charge*hours+1.00;
               JOptionPane.showMessageDialog(null,"Your total fee for parking is $" + totalFee +
               "\nPress any key to return to the main menu");
            }
            else if(hour>=360 && hour<840)
            {
               hours = (hour/60)-6;
               charge = 0.25;
               totalFee = charge*hours+3.50;
               JOptionPane.showMessageDialog(null,"Your total fee for parking is $" + totalFee +
               "\nPress any key to return to the main menu");
            }
            else if(hour>=840)
            {  
               hours = (hour/60)-14;
               charge = .10;
               totalFee = charge*hours+5.50;
               JOptionPane.showMessageDialog(null,"Your total fee for parking is $" + totalFee +
               "\nPress any key to return to the main menu");
            }
            }
            else if (e.getSource() == SeniorButton)
            {
               String time;
               String main;
      
               JOptionPane.showMessageDialog(null,"You have selected SENIOR CITIZENS");
               time=JOptionPane.showInputDialog("Enter in the total number of minutes you have parked your motorcycle in the lot.");
               JOptionPane.showMessageDialog(null,"Your total charge is $0.00." + "\nPress any key to return to the main menu.");
            }
            else if (e.getSource() == QuitButton)
            {
               JOptionPane.showMessageDialog(null,"Thank you! See you again soon!");
               System.exit(0);
            }

}}}

