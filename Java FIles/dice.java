import java.util.*; //Needed to import the random class
public class dice
{
//Data
private final int max = 6;// final means a constant
private int facevalue;

//Behavior
//Constructor creates objects
//Class is the blueprint of objects

// modifier(optional) returnType methodname(parameter)
//must specify type of parameter (int a, intb)
//constructors dont have returnType
//name of constructor is same as class name

public dice()// declaring a constructor without paramenter
{
facevalue = 1;
}
public void roll() // declaring method of rolling the dice
{
/* we generate a random number from 1-6 for the face value
    because we dont know what is gonna be the output
*/
Random gen = new Random();
facevalue = gen.nextInt(6)+1;
}
public int getfacevalue()
{
return facevalue;
}
public void setfacevalue(int newfacevalue)
{
facevalue = newfacevalue;// transforming facevalue into the set value
}
//toString method is used to print objects
public String toString()
{
String result = "This die has a face value " + facevalue;
return result;
}

}





