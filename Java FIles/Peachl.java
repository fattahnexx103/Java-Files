import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peachl extends JPanel{

   public void paintComponent(Graphics g){
   
      super.paintComponent(g);
      this.setBackground(Color.WHITE);
      
      //draw a basic line
      g.setColor(Color.BLUE);
      g.drawLine(10,25,200,45);//(x1,y1,x2,y2)
      
      
      g.setColor(Color.RED);
      g.drawRect(10,55,100,30);//x y width height
      
      //now oval
      g.setColor(Color.GREEN);
      g.fillOval(10,95,100,30);// x y width height
   
      //3d rectangle
      g.setColor(Color.ORANGE);
      g.fill3DRect(10,160,100,50,true);//raised means whether u wanna give it 3d or not
   
   }


}