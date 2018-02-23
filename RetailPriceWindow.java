import javax.swing.*;
import java.awt.event.*;


public class RetailPriceWindow extends JFrame
{
   private JPanel panel;
   private JLabel wholesale;
   private JLabel markup;
   private JTextField wholesaleField;
   private JTextField markupField;
   private JButton calcButton;
   private final int WINDOW_WIDTH = 310;
   private final int WINDOW_HEIGHT = 125;

   public TravelExpenseWindow()
   {
      setTitle("Retail Price Calculator!");

      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      buildPanel();

      add(panel);

      setVisible(true);
   }

   private void buildPanel()
   {
      wholesale = new JLabel("Enter the wholesale price:");
      
      wholesaleField = new JTextField(5);
      
      markup = new JLabel("Enter the markup amount, as a decimal:");
      
      markupField = new JTextField(5);
      
      calcButton = new JButton("Calculate!");
      
      calcButton.addActionListener(new CalcButtonListener());
    
      panel = new JPanel();
      
      panel.add(wholesale);
      panel.add(wholesaleField);
      panel.add(markup);
      panel.add(markupField);
      panel.add(calcButton);
   }
   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String w;
         String m;
         double wholesale;
         double markup;
         double markupAmount;
         double retailprice;
         
         w= wholesaleField.getText();
         
         wholesale= Double.parseDouble(w);
         
         m= markupField.getText();
         
         markup= Double.parseDouble(m);
         
         markupAmount = wholesale*markup;
         
         retailprice = wholesale+markupAmount;
         
         JOptionPane.showMessageDialog(null, " The wholesale price of this item is $" + wholesale + "." +
         "\nThe markup on this item is " + markup + " ." +
         "\nThe retail price for this item is $" + retailprice + ".");
      }
   }
}
