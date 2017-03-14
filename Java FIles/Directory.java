import java.util.*;
import java.io.*;

public class Directory { 
	final int maxDirectorySize = 1024;
	String[] directory = new String[maxDirectorySize];
	int directorySize = 0; 
	File directoryFile = null; 
	Scanner directoryDataIn = null;
	 
	Directory(String directoryFileName) {
		directoryFile = new File(directoryFileName); 
		 try { 
			 directoryDataIn = new Scanner(directoryFile); 
		 } 
		 catch (FileNotFoundException e) { 
			 System.out.printf("File %s not found, exiting!", 
					 directoryFileName); 
			 System.exit(0);
		 }
		 while (directoryDataIn.hasNext()) 
			 directory[directorySize++] = directoryDataIn.nextLine(); 
	}

	public boolean inDirectory(String name) {
		for(int i = 0; i<directorySize;i++){
			if(name.equalsIgnoreCase(directory[i]))
				return true;
		}
		return false;
	} 
	 
	public boolean add(String name) {
			if(directorySize < 1024	){
				directory[directorySize++] = name;
				return true;
			}
		return false;
	}
	 
	public boolean delete(String name) {
		int place = 0;
		boolean test = false;
		for(int i=0;i<directorySize;i++){
			if(directory[i].equalsIgnoreCase(name))
				place = i;
				test = true;
		}
		if(test){
			for(int j=place;j<directorySize-1;j++)
				directory[j] = directory[j+1];
			directorySize--;
			return true;
		}
		return false;
	}

	public void closeDirectory() { 
		directoryDataIn.close(); 
	 // close explicitly before writing
		PrintStream directoryDataOut = null; 
	 
	 // now open the directory data file for writing 
	try { 
		directoryDataOut = new PrintStream(directoryFile); 
	} 
	catch (FileNotFoundException e) { 
		System.out.printf("File %s not found, exiting!", 
			directoryFile); 
		System.exit(0); 
	} 
	 // write possibly updated directory back to file 
	for (int i = 0; i < directorySize; i++) 
		directoryDataOut.println(directory[i]); 
		directoryDataOut.close(); 
	 } 
}