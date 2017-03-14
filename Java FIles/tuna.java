public class tuna{
   public void simpleMessage(String name)//This is a method in a class
   {
   System.out.println("Hello  "+ name);
   }
   // void means its gonna do something but not return it
   //String name is a parameter. You will have to specify the data type
   
   private String girlName;
   public void setName(String name)
   {
   girlName = name;
   }
   public String getName(){// it returns a string. if not then put void
      return girlName;
      }
   public void saying() {
      System.out.printf("Your first gf was %s",getName());
      }
      
   //making a constructor
   public tuna(String name){
   girlName = name;
   }
 
   
   
   
   
   
   
   
   
   
   
   }