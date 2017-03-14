import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JList extends JFrame{

   private JList list;
   //list of colors, wen we click, bckgroundcolor changes
   private static String[] colornmaes = {"black","blue","red","white"};
   private static Color[] colors = {Color.BLACK,Color.BLUE,Color.RED,Color.WHITE};
   
   public JList(){
      super("Title");
      setLayout(new FlowLayout());
      
      list = new Jlist(colornames);
      //list of color names
      //now we set how many rows
      list.setVisibleRowCount(4);
      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//we only use single selection
      add(new JScrollPane(list)); //added list to window
      
      //now we add functionality
      //add selection listener
      list.addListSelectionListener(
         new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event){
               getContentPane().setBackground(colors[list.getSelectedIndex]);
         //whenever it clicks list, we will know whether 1.....4 color.
         }
         }
      );
   
   }

}