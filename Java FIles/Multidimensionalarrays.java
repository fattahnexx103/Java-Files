class Multidimensionalarrays{

public static void main(String[] args)
{
int array1[][]={{8,9,10,11},{4,5,6}}; //array with 2 rows. first row contains 4 elements
int array2[][]={{30,31,32,33},{43},{4,5,6}};//array with 3 rows, second rown contains 1 element

System.out.println("This is the first array");
arraydisplay(array1); //Arranges the first array

System.out.println("This is the second array");
arraydisplay(array2); // Arranges the second array


}
public static void arraydisplay(int newarray[][])//Method to display array
{
for (int row=0;row<newarray.length;row++) // Goes through each row
{
 for (int column=0;column<newarray[row].length;column++)// Goes through each column in each row
 {
 System.out.print(newarray[row][column]+"\t"); // Prints the column and rown
 }
 System.out.println();
}

}


}