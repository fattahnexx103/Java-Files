import java.io.*;
import java.util.*;

public class Clean{
   
  public static void main(String[] args) throws IOException {
    int pics = 17;
    File[] file = new File[pics];
    String prefix = "/afs/cad.njit.edu/courses/ccs/f14/cs/114/common/Birds/";
    for (int p = 1; p <= pics; ++p) {
      String suff = String.valueOf(p);
      String filename = prefix + "Fax" + suff + ".ppm";
      System.out.println("Opening "+filename);
      file[p-1] = new File(filename);
    }

    long start = System.currentTimeMillis();

    Scanner[] scan = new Scanner[pics];

    int rows = 0, cols = 0, mx = 0;
    for (int i = 0; i < pics; ++i) {
      try {
        scan[i] = new Scanner(file[i]);
        String line = scan[i].nextLine();
        cols = Integer.parseInt(scan[i].next());
        rows = Integer.parseInt(scan[i].next());
        mx = Integer.parseInt(scan[i].next());
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }

    BufferedWriter output = new BufferedWriter(new FileWriter("orig.ppm"));
    output.write(String.format("%s\n", "P3"));
    output.write(String.format("%d  %d\n", cols, rows));
    output.write(String.format("%d\n", mx));
    System.out.println(rows + ", " + cols + ", " + mx);

    
   
    for (int i = 0; i < cols; ++i) {
      for (int j = 0; j < rows; ++j) {
        for (int c = 0; c < 3; ++c) {
          int avg = 0;
          Integer[] a = new Integer[pics];
          for (int k = 0; k < pics; ++k){
            a[k] = Integer.parseInt(scan[k].next());
          }
          inssort(a);
          avg = a[16];
          output.write(String.format("%d ", avg));
        }
      }
      output.write(String.format("\n"));
    }

    for (int i = 0; i < pics; ++i) {
      scan[i].close();
    }
    output.close();
  }
   static <E extends Comparable<E>> void inssort(E[] A) {
    for (int i = 1; i < A.length; i++)
      for (int j = i; (j > 0) && (A[j].compareTo(A[j - 1]) < 0); j--)
        swap(A, j, j - 1);
  }
   private static <E extends Comparable<E>> void swap(E[] A, int i, int j) {
    E temp = A[j];
    A[j] = A[i];
    A[i] = temp;
  }
}ct = 