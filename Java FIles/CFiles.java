import java.util.*;

class CFiles{
   public static void main(String[] args){
   
   
      final Formatter x;
      
      try{
      //creates a new file with name fred if such a file does not exist
         x = new Formatter("fred.txt");//takes path of file
         System.out.println("you created a file");
         
         }
       catch(Exception e){
         System.out.println("You got an error");
       
       }  
 }
 
}