import java.util.*;
public class hashset {

	public static void main(String[] args){
		
	String[] things ={"apple","bob","bob","bacon"};
	List<String> list = Arrays.asList(things);
	
	System.out.printf("%s ",list);
	System.out.println();
	
	//hashset removes duplicate items from list
	Set<String> set = new HashSet<String>(list);
	System.out.printf("%s",set);
	
	
	}
}
