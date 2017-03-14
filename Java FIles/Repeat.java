import java.util.*; 
public class Repeat {
public static void main(String[] args)
{
Scanner stdin = new Scanner(System.in);
System.out.println("Enter a number");
int num;
num = stdin.nextInt();
while(Scanner.hasNext()) 
{num*=2;
System.out.printf("Your number is" +num);
}
}
}