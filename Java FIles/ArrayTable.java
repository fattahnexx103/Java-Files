class ArrayTable{

public static void main(String[] args)
{
System.out.println("Index\tValue"); // creates header \t skips 5 places
int array1[] = {4,56,7,24,1};

for(int counter=0;counter<array1.length;counter++)
{
System.out.println(counter + "\t" + array1[counter]);
}

}


}