import java.util.*;
import java.io.*;

public class Assignment3
{
	static int[] arr;
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		Scanner filein = stdin;
		File file;
		try
		{
			file = new File("Data3.txt"); //new File("Data3.txt");
			filein = new Scanner(file);
		}
		catch(FileNotFoundException e)
		{
			System.err.println("No file found: " + e);
			System.exit(0);
		}
		
		int s = filein.nextInt();
		arr = new int[s];
		
		for(int i = 0; i < s; i++)
		{
			arr[i] = filein.nextInt();
		}
		System.out.println("Database Server is Ready for Number Lookups!");
		System.out.print("Enter number for lookup: ");
		while(stdin.hasNext())
		{
			int num = stdin.nextInt();
			boolean found = false;
			for (int i = 0; i < arr.length; i++)
			{
				if (num == arr[i]) found = true;
			}
			if (found) System.out.println("\t>> " + num + " is in the database");
			else System.out.println("\t>> " + num + " is not in the database");
			
			System.out.print("Enter number for lookup: ");
		}
		System.out.println();
		System.out.print("Goodbye!");
	}

}
