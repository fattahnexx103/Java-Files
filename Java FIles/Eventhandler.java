//An event handler is the code that responds to mouse movement or clicks
import java.awt.FlowLayout;
import java.awt.event.ActionListener;//waits for user to do something
import java.awt.event.ActionEvent;//the actual events
import javax.swing.JFrame;
import javax.swing.JTextField;//for typing text
import javax.swing.JPasswordField;//for typing asterik passwords
import javax.swing.JOptionPane;


public class Eventhandler extends JFrame{//we created a window

   private JTextField item1;
   private JTextField item2;
   private JTextField item3;
   private JPasswordField passwordField;
   
   //we create the window now
  public Eventhandler(){
  super("The Title");
  setLayout(new FlowLayout());
  
  item1 = new JTextField(10);
  add(item1);//adds item to window
  
  item2 = new JTextField("Enter Text Here");
  add(item2);
  
  item3 = new JTextField("Uneditable",20);//text says uneditable
  item3.setEditable(false);//that text field is not editable
  add(item3);
  
  passwordField = new JPasswordField("mypass");
  add(passwordField);
  
  //screen with 4 textboxes in the actual programming
  //we add functionality now
  //we first build an action listener object
  //we want the textboxes to wait for action from user
  //and once there is response they do something
  
  thehandler handler = new thehandler();//we didnt build this class yet
  item1.addActionListener(handler);
  item2.addActionListener(handler);
  item3.addActionListener(handler);
  passwordField.addActionListener(handler);
  
  //now we build thehandler class
  
  }
   //we now build a class inside another class
   
   private class thehandler implements ActionListener{
   
 
      public void actionPerformed(ActionEvent event){
      
         String string = "";//final string that outputs
         
         if(event.getSource()==item1)
            string = String.format("field 1: %s",event.getActionCommand());
         
      else if(event.getSource()==item2)
            string = String.format("field 2: %s",event.getActionCommand());
      else if(event.getSource()==item3)
            string = String.format("field 3: %s",event.getActionCommand());
      else if(event.getSource()==passwordField)
            string = String.format("password field is: %s",event.getActionCommand());
      
      JOptionPane.showMessageDialog(null,string);//outputs the action
      }
      
   }



}