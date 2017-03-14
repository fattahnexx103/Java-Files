
public static int FindMax(int n, int[] a){
 
        if (n == 1)
          return a[0];
 
        if (n<=10)
          return Math.max(a[n-1], FindMax(a,n-1));
             
        else
          System.out.println("n is out of bounds");  
 }
