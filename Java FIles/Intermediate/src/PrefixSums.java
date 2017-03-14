import java.util.Scanner;
import java.util.*;

public class PrefixSums {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		double[] a = new double[1000000];
		
		for(int i=0;i<a.length;i++)
		a[i] = Math.random();
		
		double[] b = new double[1000000];
		
		System.out.println("Enter the number");
		int n = input.nextInt();
		long stime = System.currentTimeMillis();
		//currentTimeMillis is built in java class.
			
		for(int j = n-1;j>=0;j--)
				b[n-1]= b[n-1] + a[j];
				b[n-1] = b[n-1]/(n);
		long time = System.currentTimeMillis()	- stime;
		System.out.println(time+" miliseconds "+b[n-1]);
	}
}