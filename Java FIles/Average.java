import java.util.*;

public class  Average
{
    public static void main(String[] args)
    {
        System.out.println("Enter 3 numbers:");
        Scanner input=new Scanner(System.in);             
        
        int a,b,c;


        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        double avg=(a+b+c)/3.0;
        System.out.println("Average is "+avg);
        System.exit(0);
    }
}