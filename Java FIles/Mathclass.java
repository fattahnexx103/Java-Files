public class Mathclass{
import java.util.Random;

public static void main(String args[])
{
System.out.println(Math.abs(-26.7));//absolute value
System.out.println(Math.ceil(7.4));//rounds up the number
System.out.println(Math.floor(7.8));//rounds down the number
System.out.println(Math.max(2,9));//Max gives the maximum of the 2 numbers
System.out.println(Math.min(1,3));//Min gives the minimum of 2 numbers
System.out.println(Math.pow(5,3));//First param is the base and 2nd param is power
System.out.println(Math.sqrt(9));//Gives the square root of the number

//we learn the basic random class
//to do that we import the random class
Random dice= new Random():
int number;
//rolling the dice 10 times
//random output of the dice
for (int counter=1;counter<=10;counter++)
number=1+dice.nextInt(6);//outputs from 0 to 5
//1+ gives numbers form 1 to 6
System.out.println(number+" "):

}

}