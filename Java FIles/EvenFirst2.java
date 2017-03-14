

public class EvenFirst2 {

  public static void main(String[] args) {
      int[] arr = { 3, 4, 8, 1, 7, 6, 5, 2 };

      prt(arr);
      evenOdd(arr);
      prt(arr);
  }

  static void evenOdd(int[] a) {
    int i = 0;
    int j = a.length-1;
    while(a[i]%2 == 0)
      ++i;
    while(a[j]%2 == 1)
      --j;
    // if i<j then a[i] is first (from left) odd and a[j] is first (from right)
    // even
    System.out.println("i,j: "+i+", "+j);
    if(i>=j)
      return;
      if (i >= j)
          return;
      swap(a,i,j);
      evenOdd(a);
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
