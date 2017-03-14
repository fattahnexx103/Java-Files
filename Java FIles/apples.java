import java.util.Scanner;

class apples{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      tuna tunaObject = new tuna();
      
      
      System.out.println("Enter your name here: ");
      String name = input.nextLine();
      //name is going to store anything the user enters
      
      tunaObject.simpleMessage(name);// needed to use the simpleMessage method
      
      System.out.println("Enter name of first gf here: ");
      String temp = input.nextLine();
      
      tunaObject.setName(temp);
      tunaObject.saying();
      
      
      
      
   }
   
}   