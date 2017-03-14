public enum Enumeration{

//Enumeration are classes that declare constants
//we type public enum instead of public class

   neehad("nice","20"),
   sarah("cute","19"),
   mou("bigmistake","18"),
   
   //we now create range so we create some more constant sets
   tasnim("stupid","17"),
   emily("haram","18");
   
   private final String desc; //nice, cute and bigmistake
   private final String year; // 20, 19, 18
   
   //creating a enumeration constructor
   
   Enumeration(String description,String birthday)
   {
   desc = description;
   year = birthday;
   }
   
   public String getDesc()
   {
   return desc;
   }
   
   public String getYear()
   {
   return year;
   }

}