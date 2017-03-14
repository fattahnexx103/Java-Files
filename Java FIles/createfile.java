import java.io.*;
import java.lang.*;
import java.util.*;
public class createfile{

//we write to files

   privatte Formatter x;
   
   public void openFile(){
      try{
         x = new Formatter("Chinese.txt");
      }
      catch(Exception e){
         System.out.println("you have an error");
      }
   //gives us a file to use
   }

public void addRecords(){
//we add records

   x.format("%s%s%s","20","bucky","roberts");
   //insert this in our file
   
}
public void closeFile(){
   x.close();
//sometimes the file might be left open after we use it
}   

}


}