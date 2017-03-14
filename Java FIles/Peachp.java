import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peachp extends JFrame{

   private JButton b;
   private Color color = (Color.WHITE);
   private JPanel panel;
   
   public Peachp(){
      super("The Title");
      panel = new JPanel();
      panel.setBackground(color);
      
      b = new JButton("Choose a color");
      b.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               //user decides what color
               color = JColorChooser.showDialog(null,"Pick your color",color);
               //if they dont chose a color
               if(color == null)
                  color = (Color.WHITE);
                  
                  panel.setBackground(color);
                  
            }
         
         }
      );

   add(panel,BorderLayout.CENTER);
   add(b,BorderLayout.SOUTH);
   setsize(425,150);
   setVisible(true);
   

}


}