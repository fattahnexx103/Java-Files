import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.seing.ImageIcon;
import javax.swing.JOptionPane;

public class JButtonp extends JFrame{

   //we gonna be making buttons
   private JButton reg;
   private JButton custom;
   
   //we made 2 button variables
   //we make a constructor
   
   public JButtonp(){
      super("The Title");//super calls methods from JFrame
   //super allows access to super class i.e JFrame
      setLayout(new FlowLayout());//default layout
      
      reg = new JButton("Reg Button");//first button
      add(reg);
      
 
      Icon b = new ImageIcon(getClass().getResource("b.png"));
      Icon x = new ImageIcon(getClass().getResource("x.png"));
  //we inputed both the pictures
      custom = new JButton("Custom",b);//40x40 image button
      custom.setRolloverIcon(x);// x becomes the rollover image
      
      add(custom);
      
      //now we make an event handler
      HandlerClass handler = new HandlerClass();
      reg.addActionListener(handler);// for reg butotn
      custom.addActionListener(handler);// for custom button
      
      
     
   }
   
//now we make the handler class

private class HandlerClass implements ActionListener(){
//this means that you can use the methods of ActionListener but we gotta override every method

   public void ActionPerformed(ActionEvent event){

      JOPtionPane.showMessageDialog(null,String.format("%s",event.getActionCommand());


}

}
   
}