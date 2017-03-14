import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JPanel{


   public void paintComponent(Graphics g){
   //we use the method to create graphics
      super.paintComponent(g);
      this.setBackground(Color.WHITE);//set bckgrnd color
      
      
      //draw objects on screen
      g.setColor(Color.BLUE);
      //we draw a rectangle
      g.fillRect(25,25,100,30);//(x,y,width,height)
      
      g.setColor(new Color(190,81,215));//the numbers are RGB colors
      g.fillRect(25,60,100,30);
      //we have 2 rects
      
      g.setColor(Color.RED);
      //color for string
      g.drawString("This is a text",25,120); // 25 and 120 are x and y co-ordinates
      
   }



}

