import java.net.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
//class to link websites to text.
//applet will be used in html code
public class Nexxsites extends JApplet {
	
	private HashMap<String,URL> websiteInfo;//takes key and values
	//gonna store titles with urls
	//list that stores titles
	private ArrayList<String> titles;
	private JList mainList;
	
	//init
	public void init(){
		websiteInfo = new HashMap<String, URL>();
		titles = new ArrayList<String>();
		
		grabHTMLInfo(); // gonna take info from html and stick it into hashmap
		add(new JLabel("What website do you want to visit?"),BorderLayout.NORTH);
		//adds title^
		mainList = new JList(titles.toArray()); // contains the titles as newboston.org
		
		mainList.addListSelectionListener(
				new ListSelectionListener(){
					public void valueChanged(ListSelection event ){
					Object object = mainList.getSelectedValue();//gets title of website	
					}
				}
				);
	}

}
