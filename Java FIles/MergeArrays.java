//write an application that creates two sorted arrays from the keyboard. The application implements a method merge that takes these 2 arrays as parameters
//and returns a third array containing all of the data from both arrays merged sorted in ascending order
import java.util.*;

public class MergeArrays
{
public static void main(String[] args)
{
int[] array1= new int[4];
int[] array2 = new int[7];

Scanner scan = new Scanner(System.in);

for(int i=0;i<array1.length;i++)
   array1[i]= scan.nextInt();
for(int i=0;i<array2.length;i++)
   array2[i]= scan.nextInt();
   
int[] array3 = merge(array1,array2);

    
for(int i=0;i<array3.length;i++)
   System.out.print(array3[i]+" ");



}
public static int[] Merge(int[]a,int[]b)
{
   
int[] c = new int[a.length+b.length];
int posA=0;
int posB=0;
int posC=0;

while(posA < a.length && posB < b.length)
{
if (a[posA] <= b[posB])
{
   c[posC]=a[posA];
   posA++;
   posC++;
}
else
{
   c[posC]=b[posB];  
   posB++;  
   posC++;
}

}
//if you reached the end of array a, transfer the rest of b to c
//otherwise if you reached end of array b, transfer the rest of a to c

if(posA==a.length)
{for(int i = b[posB]; i<b.length;i++)
{
    c[posC]=b[i];  
  
      posC++;
}  
}
else
{for (int i = posA;i<a.length;i++)
{
      c[posC]=a[i];
      posC++;
}      
}
return c;

//Read Chapter 12 for recursion and sorting arrays

 

}