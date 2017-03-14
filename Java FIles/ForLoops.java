class ForLoops {

public static void main(String[] args)
{
for (int i = 0; i <= 9000; i++)
{
System.out.println("I love you Sarah" );
}

//Enhanced for loops

int array1[] ={1,2,3,5,20};
int total = 0;

for (int x: array1)//first takes the type of variable followed by loop name
{
total += x;
}

System.out.printf("The sum of the loop is %s",total);












}

}