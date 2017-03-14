import java.awt.*;
import javax.swing.*;

public class OvalSlider extends JPanel {

	private int d = 10; //diameter
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.fillOval(10, 10, d,d); //height and width is d for the circle
		}
	public void setD(int newD){
		d= (newD>=0? newD:10);//is number > 0. if yes then thats the d else d =10
		repaint();//automatically calls paint component
	}
	public Dimension getPreferredSize(){
		return new Dimension(200,200);
	}
	public Dimension getMinimumSize(){
		return getPreferredSize();
	}
}
