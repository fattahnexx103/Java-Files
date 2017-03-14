class ArrayChanger{

public static void main(String[] args){

int array1[] = {1,5,6,7,8};
arraychange(array1);

for (int x: array1)
System.out.println(x);


}

public static void arraychange(int newarray[])
{
for (int counter=0;counter<newarray.length;counter++)
newarray[counter] += 5;

}

}