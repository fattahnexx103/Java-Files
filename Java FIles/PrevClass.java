
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