public class finalclass{
   private int sum; // sum of numbers we are gonna add up
   private final int NUMBER; //its a constant
   
   //final is you cannot modify the number and we set it equal to once
   
   public finalclass(int x){
      NUMBER=x;
      }
   public void add(){
      sum+=NUMBER;
      }
   public String toString(){
      return String.format("sum = %d\n",sum);
      }
      

}