public class polymain{

public static void main(String[] args){

   //we build a polymorphic array
   
   polym array1[] = new food[2];
   array1[0] = new potpie();//holds a potpie object in array1
   array1[1] = new tuna();// holds a tuna object in array1
   
   for(int x=0;x<2;++x){
      array[x].eat();
      //loops through the method in each class 
   }
   
   //this program wont run because the classes are not made

}




}