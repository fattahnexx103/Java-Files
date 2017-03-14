import java.util.*;
public class Die {
   private final int MAX = 6;
   private int faceValue;
   
   public Die() {
      faceValue = 1;
   }
   
   public void roll() {
      Random gen = new Random();
      faceValue = gen.nextInt(6) + 1;
   }
   
   public int getFaceValue() {
      return faceValue;
   }
   
   public void setFaceValue(int newFaceValue) {
      faceValue = newFaceValue;
   }
   
   public String toString() {
      String result = "This die has a face value: " + faceValue;
      return result;
   }
}