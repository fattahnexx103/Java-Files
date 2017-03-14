import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class Mouse extends JFrame{

   private JPanel mousepanel;//area where u can click
   private JLabel statusbar;//status bar says the mouse action
   
   
   public Mouse(){
   
      super("The Title");
      
      mousepanel = new JPanel();
      mousepanel.setBackground(Color.WHITE);
      add(mousepanel,BorderLayout.CENTER);//fill up all empty space
      
      statusbar = new JLabel("default");
      add(statusbar,BorderLayout.SOUTH);
      //appears bottom of the screen
      
      Handlerclass handler = new Handlerclass();
      ///we implement 2 listeners
      mousepanel.addMouseListener(handler);
      mousepanel.addMouseMotionListener(handler);
      
      
   }

private class Handlerclass implements MouseListener,MouseMotionListener{

   public void mouseClicked(MouseEvent event){
   statusbar.setText(String.format("Clicked at %d,%d",event.getX(),event.getY()));
   }//we get the x and y cordinate
  public void mousePressed(MouseEvent event){
   statusbar.setText("you pressed the mouse");
}
   public void mouseReleased(MouseEvent event){
   statusbar.setText("you released the button");
}
   public void mouseEntered(MouseEvent event){
   //when mouse enters mousepanel
   statusbar.setText("You eneted the area");
   mousepanel.setBackground(Color.RED);
}
   public void mouseExited(MouseEvent event){
   statusbar.setText("The mouse has left the window");
   mousepanel.setBackground(Color.WHITE);
}
   public void mouseDragged(MouseEvent event){
      statusbar.setText("you are dragging");
      } 
 public void mouseMoved(MouseEvent event){
   statusbar.setText("you moved the mouse");
}

}

}









