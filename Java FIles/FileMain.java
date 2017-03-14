import java.io.File;


class FileMain{

   public static void main(String[] args){
   
   
   File x = new File("C:\\test\\greg.txt");
   //always put \\ instead of one
   
   //we check if the file exists
   
   if(x.exists())
      System.out.println(x.getName()+"exist");
   else
      System.out.println("File dosent exist");
   
   
   
   }
}