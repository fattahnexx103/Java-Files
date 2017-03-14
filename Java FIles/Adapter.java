import java.awt.*;

public class Adapter extends JFrame{

//when u inherit from adapter clas u dont edit all method
//only the methods u want to

   private String details;
   private JLabel statusbar;
   
   public Adapter(){
   
      super("Title");
      
      statusbar = new JLabel("This is default");
      add(statusbar,BorderLayout.SOUTH);
      
      addMouseListener(new MouseClass());
   
   }
//now we crrate mouse class

private class MouseClass extends MouseAdapter{

   public void mouseClicked(MouseEvent event){
      details = String.format("You clicked %d".event.getClickCount);
   
      if(event.isMetaDown())//what type of mouse button
         details += "with right mouse button";
         else if(event.isAltDown())
            details+="either center mouse button";
         else 
            details +="with left mouse button";   
      statusbar.setText(details);
   }
}
}