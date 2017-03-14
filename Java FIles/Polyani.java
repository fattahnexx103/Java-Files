public class Polyani{

public static void main(String[] args){


   Animal[] thelist = new Animal[2];// an array to hold 3 objects of animal
   Dog d = new Dog();
   Fish f = new Fish();
   
   thelist[0] = d;//first element is dog object
   thelist[1] = f;// second element is fish object
   
   
   for(Animal x:thelist)//enhanced for loop
      x.noise();
      //loop through the array and then go through the noise methods

}



}