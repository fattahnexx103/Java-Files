import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class TheWindow extends JFrame {

	private JSlider slider;//the slider
	//we now need panel
	private OvalSlider myPanel; 
	
	public TheWindow(){
		super("The Title");
		myPanel = new OvalSlider();
		myPanel.setBackground(Color.ORANGE);
	
		slider = new JSlider(SwingConstants.HORIZONTAL,0,200,10);
		slider.setMajorTickSpacing(10);// the ticks for the slider
		slider.setPaintTicks(true);
	
		slider.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e){
						myPanel.setD(slider.getValue());
					}
						
				}
				
				);
				add(slider,BorderLayout.SOUTH);
				add(slider,BorderLayout.CENTER);
	}
	
}
