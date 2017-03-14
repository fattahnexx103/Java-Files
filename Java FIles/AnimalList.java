public class AnimalList{
//we have the array to hold any type of animal whether dog or fish or some new animal

   private Animal[] thelist = new Animal[5];//array to hold 5 objects of type animal
   private int i = 0;
   
   
   public void add(Animal a){
   
   if(i<thelist.length)
   thelist[i]=a;
   System.out.println("Animal added at index "+i);
   i++;
   
   
   
   }



}