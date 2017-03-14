import java.util.*;
public class ListMethods {

	public static void main(String[] args){
		
		String[] crap = {"apples","lemons","geese","bacon","youtube"};
		List<String> l1 = Arrays.asList(crap);
		//converts array to list and stores it in l1
		
		Collections.sort(l1);
		System.out.printf("%s\n",l1);
		//sorts list in alphabetical order
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.printf("%s\n",l1);
		//reverses the order of the list
		Character[] ray ={'p','w','n'};
		List<Character> l = Arrays.asList(ray);
		System.out.println("list is : ");
		output(l); // we make this later on
		
		//reverse and print out the list
		Collections.reverse(l);
		System.out.println("After reverse : ");
		output(l);//reverses any collection
		
		//copy of a list
		//creates new array and a new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		//empty list of 3 elements
		
		//copy contents of list into listcopy
		Collections.copy(listCopy,l);//(dest,source)
		System.out.println("Copy of the list: ");
		output(listCopy);
		
		//fill collection with crap\
		Collections.fill(l,'X');
		System.out.println("After filling the list: ");
	
		//convert stuff array to alist
		String[] food = {"apples","beef","corn","ham"};
		List<String> list1 = Arrays.asList(food);
		//converted food to a list
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("youtube");
		list2.add("google");
		list2.add("digg");
		
		for(String x: list2)
			System.out.printf("%s ",x);
		Collections.addAll(list2,food);
		//takes all elements from list 2 and adds it to food
		
			System.out.println();
			for(String x: list2)
				System.out.printf("%s ",x);
		
		//frequency and disjoint methods
		System.out.println(Collections.frequency(list2, "digg"));
		//finds out how many times digg is in list 2
		
		boolean tof = Collections.disjoint(list1, list2);
		//since they have items in common, it will return false.
		
		if(tof)	
			System.out.println("nothing in common");
		else
			System.out.println("something in common");
	
	
	
	
	}
		
		//output method
		private static void output(List<Character>thelist){
			for(Character thing: thelist)
				System.out.printf("%s",thing);
			System.out.println();
		}
		
	
}
