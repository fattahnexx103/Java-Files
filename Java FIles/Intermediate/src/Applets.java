import java.awt.*;
import javax.swing.*;
public class Applets extends JApplet{
	
//applet is using java program through internet browser
	//paint something
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("The sum is" +sum, 25, 26);
		
	//init for applets
		//program that takes 2 numbers from user and adds em
	}
	private double sum;
	
	public void init(){
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");
		
		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);
		
		sum = n1 +n2;
	}
//in html
//method to put applet in browser
	//<applet code ="Bucky.class" width = "400" height="100">
//	</applet>
}
