import javax.swing.*;
import java.awt.event.*;


public class MonthlySalesTaxWindow extends JFrame
{
   private JPanel panel;
   private JLabel totalsales;
   private JTextField TSField;
   private JButton calcButton;
   private final int WINDOW_WIDTH = 300;
   private final int WINDOW_HEIGHT = 100;

   public MonthlySalesTaxWindow()
   {
      setTitle("Monthly Sales Calculator!");

      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      buildPanel();

      add(panel);

      setVisible(true);
   }

   private void buildPanel()
   {
      totalsales = new JLabel("Enter the total sales amount for this month:");
      
      TSField = new JTextField(5);
      
      calcButton = new JButton("Calculate!");
      
      calcButton.addActionListener(new CalcButtonListener());
    
      panel = new JPanel();
      
      panel.add(totalsales);
      panel.add(TSField);
      panel.add(calcButton);
   }
   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String ts;
         double totalsales;
         double countytax;
         double statetax;
         double totaltax;
         
         ts = TSField.getText();
         
         totalsales= Double.parseDouble(ts);
         
         countytax = totalsales*.02;
         statetax = totalsales*.04;
         totaltax = countytax+statetax;
         
         JOptionPane.showMessageDialog(null, " The total county tax paid is $" + countytax + "." +
         "\nThe total state tax paid is $" + statetax + " ." +
         "\nIn total, you have paid $" + totaltax + " in taxes this month.");
      }
   }
}
