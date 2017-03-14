import java.util.*;
public class GenericReturn {

	public static void main(String[] args){
		
	System.out.println(max(23,42,1));
	System.out.println(max("apples","tots","chicken"));
	
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
