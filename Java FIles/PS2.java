import java.util.*;
public class PS2{

   public static void main(String[] args){
   
   Arraymax(5);
   
   
   
   }








public static int Arraymax(int a){
int n;
if(a==1)
   return a;
if(a<=10)
   n = a;
else
throw new IllegalArgumentException();
int x = n*Arraymax(n-1);
int[]b = {x};
Arrays.sort(b);
 int max = b[b.length - 1];
   return max;




}

}