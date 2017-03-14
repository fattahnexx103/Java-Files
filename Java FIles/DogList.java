public class DogList{

   private Dog[] thelist = new Dog[5];//array to hold 5 onjects from Dog class
   private int i =0;
   

   //new method to add dog objects
   public void add(Dog d){
   
      if(i<thelist.length)//check if array has space
         thelist[i]=d;
         System.out.println("Dog added at index "+i);
         i++;
   
   }




}