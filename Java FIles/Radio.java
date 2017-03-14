import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Radio extends JFrame{

   private JTextField tf;
   private Font pf;
   private Font bf;
   private Font itf;
   private Font bif;
   private JRadioButton pb;
   private JRadioButton bb;
   private JRadioButton ib;
   private JRadioButton bib;
   private ButtonGroup group;//establish a relationship so that only 1 button can be selected at a time
   
   public Radio(){
   
      super("The TItle");
      setLayout(new FlowLayout());
      
      tf = new JTextField("Bucky is awesome and hot",25);
      add(tf);
      
      pb = new JRadioButton("plain",true);
      bb = new JRadioButton("bold",false);//true is checked, false in unchecked
      ib = new JRadioButton("italic",false);
      bib = new JRadioButton("bold and italic",true);
      add(pb);
      add(bb);
      add(ib);
      add(bib);
      
      group = new ButtonGroup();
      group.add(pb);
      group.add(bb);
      group.add(ib);//group now has 3 buttons
      group.add(bib);//group now has 4 buttons
      
      //now we set the font
      pf = new Font("Serif",Font.PLAIN,14);
      bf = new Font("Serif",Font.BOLD,14);
      itf = new Font("Serif",Font.ITALIC,14);
      bif = new Font("Serif",Font.BOLD + Font.ITALIC,14);
      tf.setFont(pf); // default font on textbox
      
      //wait for event to happen, pass in font object to constructor
      pb.addItemListener(new HandlerClass(pf));
      bb.addItemListener(new HandlerClass(bf));
      ib.addItemListener(new HandlerClass(itf));
      bib.addItemListener(new HandlerClass(bif));
   
   }

//now we make handler class

private class HandlerClass implements ItemListener{

   private Font font;
   //the font object get variable font
   public HandlerClass(Font f){
   
      font = f;
   }
//sets the font to the font object that was passed in
   public void itemStateChanged(ItemEvent event)
   {
      tf.setFont(font);
   }
}

}