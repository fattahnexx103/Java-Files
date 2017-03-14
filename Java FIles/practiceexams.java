import java.util.Scanner;
public class practiceexams
{
public static void main(String[] args) throws IOExceptions
{


int[] a = new int[3];
a[0]=35;
System.out.println("First element is:" + a[0]);
a[1]=36;
a[2]=26;
System.out.println(a[2]);

//2 dimensional array
int[] []b = new int[5][5]; //Makes 5 rows and 4 coloums for each row

System.out.println("Please enter a number");

Scanner input = new Scanner(System.in);
input = input.nextInt();

for (int counter=0;counter<b.length;counter++)//Loop for every row
{
for (int i = 0;i<4;i++)//Loop for every coloumn
{
b[counter][i] = input.nextInt(); // Getting data into respective rows and coloum
}
//Print and add up all summations in row 2
int sumrow = 0;
for (int c = 0;c<4;c++)
{
sumrow = sumrow +b[2][c];
}
System.out.println("The sum of the elemets at row 2 is " + sumrow);
}






}

}