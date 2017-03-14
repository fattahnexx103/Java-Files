import java.util.Scanner; //imports the Scanner method for use
public class userinput
{
public static void main(String args[])
{
//Getting user input
//We use the scanner method to store input in a variable
Scanner input1= new Scanner(System.in);
System.out.println("Input something");

//input variable collects user input and stores it
System.out.println(input1.nextLine());

//Variables and user input
double num1,num2,answer; // Declares 3 variables

System.out.println("Enter first and second number: ");
num1= input1.nextDouble();
num2 =input1.nextDouble();

answer = num1+num2;
System.out.print("The sum of your numbers is " + answer);









}

}