
public class arryspractice
{
public static void main(String[] args)
{
//array holds a value
int bucky[]=new int[10];//Size of the array. Array holds 10 values

bucky[0]=87;
bucky[1]=542;
bucky[9]=9;

System.out.println(bucky[1]);// prints out the value stored in the array
//array initializer
int sasu[]={1,2,4,5,6}; // The values inside the brackets are stored
System.out.println(sasu[1]); // Prints out the value in the first index i.e 2

System.out.println("Index\tValue");
int meow[]={32,17,2,4};

//for loop using array
for (int counter=0;counter<bucky.length;counter++)//starts at 0.Loop runs the number of time the length of array
//loop runs at 0 and runs 4 times
System.out.println(counter+"\t"+meow[counter]);

}
}
