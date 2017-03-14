
public class minarray {
	public static void main(String[] args){
		int[] example = {2,4,5,6,7};
		System.out.println(FindMax(4,example));
		
	}
public static int FindMax(int n, int[] a){
 
        if (n == 1)
          return a[0];
 
        if (n<=10)
          return Math.max(a[n-1], FindMax(n-1,a));
             
        else
          return System.out.println("n is out of bounds");  
 
 }
 }