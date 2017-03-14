import java.util.Scanner;
import java.util.*;

public abstract class SortBinaries implements Comparable {
	public static void main(String[] args){
   
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
      
		int[] numarray = new int[n];
		String[] binaries = new String[n];
      
	for(int i=0;i<n;i++){
			numarray[i] = input.nextInt();
		   }
	for(int i=0;i<n;i++){
			binaries[i] = Integer.toBinaryString(numarray[i]);
		   }
   Sorting.selectionSort(binaries);
	for(int i=0;i<n;i++)
			System.out.printInteger.parseInt(binaries[i],2));
         System.out.println();
	}
}
/*
PrevClass 


class PrevClass extends Progression {
  
  long prev;   
 
  
  FibonacciProgression() {
    this(2,200);
  }
  
  Progression(long value1, long value2) {
      first = value1;
      prev = value2 - value1; 
  }
  
  protected long nextValue() {
    long temp = prev;
    prev = cur;
    cur += temp;
    return cur;
  }
}

\*