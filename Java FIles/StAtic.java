public class StAtic{
// we learn what static variables are
//sometimes we want all the objects have the same variable
//we make a club of hot chicks lolz

   private String first;
   private String last;
   private static int members=0; //the objects share this variable
   //we have 0 members in our club
   
public StAtic(String fn, String ln)
{
first=fn;
last=ln;
members++;
System.out.printf("Constructor for %s %s, members in the club: %d\n",first,last,members);

}

public String getFirst(){
   return first;
}

public String getLast(){
   return last;
}

public static int getMembers(){
   return members;
}

}