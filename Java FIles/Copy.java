// Copy the integers input until -1 is input
import java.util.*; // for class Scanner
public class Copy {
public static void main(String[] args) {
Scanner stdin = new Scanner(System.in);
System.out.println("Ready to copy!\n" +
"Enter 0 when done!");
double num;
int n = 0;
double total=0;
double average=0;
num = stdin.nextDouble();
while(num != 0.0) {
System.out.printf("%.2f\n", num);
n++;
total=total+num;
average=total/n;
num = stdin.nextDouble();
}
System.out.println("Goodbye!");
System.out.printf("Count of numbers read: %1d\n",n);
System.out.printf("Total value of numbers read: %.2f\n",total);
System.out.printf("Average value of numbers read: %.2f\n",average);
System.exit(0);
}
}