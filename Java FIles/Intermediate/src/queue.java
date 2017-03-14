import java.util.*;
public class queue {

	public static void main(String[] args){
		
		//queue is a line to store something
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("first");//first priority
		q.offer("second"); //second priority
		q.offer("third");//third priority
		
		System.out.printf("%s ",q);
		System.out.println();
		
		System.out.printf("%s",q.peek());
		System.out.println();
		//q.peek looks at element with hightest priority and returns it
		
		//removing element with highest priority
		q.poll();
		System.out.printf("%s",q);
		
	
	}
	
	
}
