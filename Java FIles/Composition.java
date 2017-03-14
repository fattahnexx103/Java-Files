public class Composition{

   private String name;
   private toStringMethod birthday;//refers to toStringMethod class object

   public Composition(String theName,toStringMethod theDate)
   {
   name= theName;
   birthday= theDate;
   }
   
   public String toString()
   {
   return String.format("My name is %s, My birthday is %s",name,birthday);
   //birthday is not a string but refers to a class
   //but we need to output a string
   //therefore it goes into the toStringMethod class to look for
   //a toString method and then uses that string information to output there
   
   }
   
   
}