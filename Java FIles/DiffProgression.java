import java.util.*;

public class DiffProgression {
    public static void main(String[] args) {
        
        int n = 6;
        PrevClass program = new PrevClass();
        System.out.println(program.first);
        
        for(int i = 0;i<n-3;i++){
            System.out.println(program.cur);
            System.out.println(Math.abs(program.first-program.cur));
            prog = new PrevClass(Math.abs(program.first-program.cur),Math.abs(program.cur-Math.abs(program.first-program.cur)));
        }
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