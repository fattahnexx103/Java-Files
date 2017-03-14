import java.util.Random;

class Randomnumgen{

   public static void main(String[] args)
   {
   Random dice = new Random(); // Creates random object
   int numberstored; // stores number on dice
   
   for(int counter=1;counter<=10;counter++)
   
   {
   int number = 1 + dice.nextInt(6); // Generates random number from 1 to 6
   System.out.println(" number " +number);//10 random numbers from 1 -6
   
   }
   
   
   
  
   }
   
   
   
   
   }