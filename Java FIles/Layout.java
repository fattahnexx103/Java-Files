import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout extends JFrame{

   private JButton lb;
   private JButoon rb;
   private JButton rb;
   private FlowLayout layout;
   private Container container;
   
   public Layout(){
      super("The Titile");
      layout = new FlowLayout();//left to right
      container = getContentPane();//we set container object..get bulk of window
      setLayout(layout);
   //this creates a window
   
      lb = new JButton("left");
      add(lb);
      lb.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               layout.setAlignment(FlowLayout.LEFT);//shifts entire layout to left
               layout.layoutContainer(container);//re-arrange everything after shift
            }
         }
      );
      //center stuff
      cb = new JButton("center");
      add(cb);
      cb.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               layout.setAlignment(FlowLayout.CENTER);//shifts entire layout to left
               layout.layoutContainer(container);//re-arrange everything after shift
            }
         }
      );
      //right
      rb = new JButton("right");
      add(rb);
      rb.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               layout.setAlignment(FlowLayout.RIGHT);//shifts entire layout to left
               layout.layoutContainer(container);//re-arrange everything after shift
            }
         }
      );
   }
   }