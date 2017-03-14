
import java.util.Scanner;

/*
 * Read in an integer array of length n and an integer k. Rearrange
 * the array so that all numbers less than k come first.
 */

public class SmallerFirst {

  public static void main(String[] args) {
      //int[] arr = { 3, 4, 8, 1, 7, 6, 5, 2 };
      //int k = 5;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); //get array size
      int k = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;++i)
        arr[i] = sc.nextInt();

      prt(arr);
      smallFirst(arr, 0, arr.length - 1,k);
      prt(arr);
  }

  static void smallFirst(int[] a, int i, int j, int k) {
      if (i >= j)
          return;
      if (a[i] <= k)
          smallFirst(a, i + 1, j,k);
      else {
          if (a[j] <= k) {
              swap(a, i, j);
              smallFirst(a, i + 1, j - 1,k);
          } else
              smallFirst(a, i, j - 1,k);
      }
  }

  static void prt(int[] a)
  {
      for(int i=0;i<a.length;++i)
          System.out.print(a[i] + "  ");
      System.out.println();
  }

  static void swap(int[] a, int i, int j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
  }
}
