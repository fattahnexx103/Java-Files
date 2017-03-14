import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.event.*;
public class Browser extends JFrame{
	//consists of address bar and body
	private JTextField addressBar;
	private JEditorPane display;
	
	//constructor
	public Browser(){
		super("Browser");
		
		addressBar = new JTextField("Enter a URL");//default text is inside parameter
		addressBar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						//whenever they hit enter this method is carried out
						loadCrap(event.getActionCommand());//our method of reading an HTML file and displaying it on screen
					//getactioncommand is going to take string inside of address bar and passes it onto load crap	
					
					
					}
					
				}
				);
	
	add(addressBar, BorderLayout.NORTH);
	
	display = new JEditorPane();
	display.setEditable(false);//this asks whether content inside pane is editable or nah
	display.addHyperlinkListener(
	//grabs hyperlink and adds it to load crap method
			new HyperlinkListener(){
				public void hyperlinkUpdate(HyperlinkEvent event){
					if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
						loadCrap(event.getURL().toString());//if link is clicked, 
					}
				}
			}
			);
	add(new JScrollPane(display),BorderLayout.CENTER);
	setSize(500,300);
	setVisible(true);
	}
	//load crap to display on the screen
	private void loadCrap(String userText){
		try{
		display.setPage(userText);//gonna set the typed url into the url of the addressbar	
		addressBar.setText(userText);	
	}catch(Exception e){
		System.out.println("crap!");
	}
	}
	}
