import java.util.EnumSet;
public class Enumpractice{

public static void main(String[] args)
{

for(Enumeration people:Enumeration.values())//Enumeration.values is a built in array method
//it loops through all the constant objects
//.values makes all the constant objects into an array
System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());

//we print out a line
System.out.println("\n\n\nAnd now for the range of constants\n");

   //we need to import the enumset class first

   for(Enumeration people:EnumSet.range(Enumeration.neehad,Enumeration.tasnim))
   System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
   
   //the EnumSet.range allows us to not go through all the constants but a range of constants
   
}

}