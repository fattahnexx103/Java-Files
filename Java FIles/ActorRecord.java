import java.util.ArrayList;
import java.util.*;

public class ActorRecord{

   ArrayList<String> movies;
   String name;
   
   public ActorRecord(String name ){
      movies = new ArrayList<String>();
      this.name = name;
     
   
   }
   public void addMovie(String movie){
   movies.add(movie);}
   
   public int movieCount(){
      int counter = 0;
      for(int i  = 0; i<movies.size();i++)
      if(movies.get(i).contains("FM"))
         counter++;
         
         return counter;}
    public String toString(){
      return name + "\t"+ movies;
      }
   
   
  
  
   }