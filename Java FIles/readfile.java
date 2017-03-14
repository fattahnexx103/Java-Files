import java.io.*;
import java.util.*;

public class readfile{

//reading from a file
   private Scanner x;
   
   public void openFile(){
   
      try{
         x = new Scanner(new File("chinese.txt"));
      }
      catch(Exception e){
         System.out.println("could not find file");
      }

}

public void readFile(){
   while(x.hasNext()){ // while file has somethig in it
      String a = x.next();//first word
      String b = x.next();// second word
      String c = x.next();// third word

   System.out.printf("%s %s %s\n",a,b,c);
}

public void closeFile(){
   x.close();

}


}

}