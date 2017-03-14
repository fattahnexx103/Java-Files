import java.util.*;
public class ListtoArray {
	public static void main(String[] args){
		
	String[] stuff ={"babies","watermelon","melon"};	
	LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));	
	//arrays.aslist(stuff) makes the array stuff into a list and stores it into
	//the list thelist.

	thelist.add("pumpkin");
	thelist.addFirst("firstthing");
	
	//convert list back to an array
	stuff = thelist.toArray(new String[thelist.size()]);//the size of your array is the size of your list
	//the list is converted back into an array
	
	for(String x: stuff)
		System.out.printf("%s ",x);
}
	
}