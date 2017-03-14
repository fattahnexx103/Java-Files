
import java.awt.FlowLayout;//import how things are placed.
import javax.swing.JFrame;//JFrame gives all the basic Windows features
import javax.swing.JLabel;//Output texts and images on screen 

public class GUI2 extends JFrame{ //we have all of the windows features

   private JLabel item1;// the variable
   
   public GUI2(){
      //title of the window 
      super("The Title Bar");
      //next we set layout
      setLayout(new FlowLayout());//gives us a default layout
      
      item1 = new JLabel("This is a Sentence");
      //now we add functionality. 
      //we make a scroll box hover over it
      item1.setToolTipText("This is gonna show up on hover");
      //add item to the window
      add(item1);
   }
   
   


}