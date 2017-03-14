import java.util.*;


public class LinkedLists {
	public static void main(String[] args){
		
		String[] things = {"apples","noobs","pwnge","bacon","goats"};
		List<String> list1 = new LinkedList<String>();
		for(String x:things)
			list1.add(x);
		
		String[] things2 = {"sausage","bacon","goats","harrypotter"};
		List<String> list2 = new LinkedList<String>();
		for(String y:things2)
			list2.add(y);
		
		list1.addAll(list2);//add all contents of list 2 into list 1
		list2 = null;//clears list 2
		
		printMe(list1);
		removeStuff(list1,2,5);
		printMe(list1);
		reverseMe(list1);
		
	}
	
	
//printMe method
	private static void printMe(List<String> l){
		for(String b:l)//goes through the list l
			System.out.printf("%s ", b);
		System.out.println();
	}
//removestuff
	private static void removeStuff(List<String>l,int from,int to){
		l.subList(from,to).clear();
	}// the above means return a portion of the list and clears it
	
//reverseMe method

	private static void reverseMe(List<String>l){
		ListIterator<String> iterator = l.listIterator(l.size());//we wamt to start at the very end and reverse it
		while(iterator.hasPrevious())
			System.out.printf("%s ", iterator.previous());
	}
//list iterator reverses the list
//l.size() starts from the last element of the list	
//has previous starts r


	
	
	
	
	
	
	
	
	
	
}
