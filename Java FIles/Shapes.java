import javax.swing.*;
import java.awt.*;

public class Shapes {

public static void main(String[] args){

   JFrame f = new JFrame("Title");
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   Peachl p = new Peachl();
   p.setBackground (Color.WHITE);
   f.add(p);
   f.setSize(500,270);
   f.setVisible(true);

}

}