import java.util.*;

public class DirectoryWithObjectDesign {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		String directoryDataFile = "Directory.txt"; 
		Directory d = new Directory(directoryDataFile); 
		while (stdin.hasNext()) { 
			String command = stdin.next(); 
			String name = stdin.next(); 
	 
			if (command.equalsIgnoreCase("find")) { 
				if (d.inDirectory(name)) 
	 			System.out.println(name + " is in the directory"); 
	 		else 
	 			System.out.println(name + " is NOT in the directory"); 
			} else if (command.equalsIgnoreCase("add")) { 
				if (d.add(name)) 
	 			System.out.println(name + " added"); 
	 		else 
	 			System.out.println(name + " cannot add! " + 
	 				"no more space or already in directory"); 
			} else if (command.equalsIgnoreCase("delete")) { 
				if (d.delete(name)) 
					System.out.println(name + " deleted"); 
				else 
					System.out.println(name + " NOT in directory"); 
			} else { 
				System.out.println("bad command, try again"); 
			} 
	 	}
		d.closeDirectory();
	}
}