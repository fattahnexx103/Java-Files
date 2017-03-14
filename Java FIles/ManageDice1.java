public class ManageDice1 {
   public static void main(String[] args) {
      Die one = new Die();
      Die two = new Die();
      
      one.roll();
      System.out.println(one);   
      two.setFaceValue(5);
      System.out.println(two);
      System.out.println((one.getFaceValue() + two.getFaceValue()) / 2.0);  
   }
}