public class testdice
{
public static void main(String[] args)
{
// We will make 2 objects
dice one = new dice();
dice two = new dice();
//Roll die 1
one.roll();
System.out.println(one); // one.toString()
// will print "THe face value is whatever the roll is
//Roll die 2
two.setfacevalue(5);
System.out.println(two); 

double averagedice = (one.getfacevalue() + two.getfacevalue())/2.0;
System.out.println(averagedice);


}

}