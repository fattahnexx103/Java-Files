import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Combo extends JFrame{

//combo box is a drop down list

   private JComboBox box;
   private JLabel picture;//the picture
   
   private static string[] filename = {"b.png","x.png"} //array with two images
   private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1])}//stores the files themselves

   public Combo(){
   
   super("The Title");
   setLayout(new FlowLayout());
   
   box = new JComboBox(filename);//automatically put all the pics in a list
   
   //now we create item listener
   
   box.addItemListener(
      //we put an anonymous class in here
      new ItemListener(){
         public void itemStateChanged(ItemEvent event)
            if(event.getStateChange() == ItemEvent.SELECTED)
               picture.setIcon(pics[box.getSelectedIndex()]);
      
      }
   );
      add(box);
      picture = new Jlabel(pics[0]);
      add(picture);
   }

}