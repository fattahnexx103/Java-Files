public class StaticPractice{

public static void main(String[] args){

  StAtic member1= new StAtic("Megan","Fox"); 
  StAtic member2= new StAtic("Taylor","Swift");
  StAtic member3= new StAtic("Sarah","Sayeed");

  System.out.println();
  System.out.println(member2.getFirst());
  System.out.println(member2.getLast());
  System.out.println(member2.getMembers());
  
  System.out.println(StAtic.getMembers()); //for static we can use that since the variable is the same
}
}