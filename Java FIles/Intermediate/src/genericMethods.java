import java.util.*;
public class genericMethods {
	
	public static void main(String[] args){
		
		Integer[] iray = {1,2,3,4};
		Character[] cray ={'b','u','c','y'};
		
		printMe(iray);
		printMe(cray);
	 
	  
	}

	//generic method is using the same method for all data types
	
	public static <T> void printMe(T[] x){
		//takes T array and treats it as x
		//can take an array of either string or int or char
		
		for(T b: x)
			System.out.printf("%s " ,b);
		System.out.println();
	}
	
	public static <N extends Comparabale<N>> N max(N a, N b, N c ){
		N m = a; //assuming a is maximum
		
		if(b.compareTo(a) > 0)
			//if b is less then -, if equal 0 and if more than 0 then +
			m = b;
		//new max is b
		if(c.compareTo(m) >  0)
			m = c; // new max is c
		return m;
		
	}
}
