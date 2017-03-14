//1d:
//		int x1 = 5; int x2 = 6;
//		int y1 = 7; int y2 = 8;
//		double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
//		System.out.println("The distance between the two points is: "+ distance);

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] Args){
		Scanner stdin = new Scanner(System.in);
		double tC = 0;
		double tF = 0;

		tC =  ((tF-32.0)*5.0)/9.0;//Formulas
		tF = ((tC*9.0)/5.0)+32;
		
		System.out.println("Welcome to the Temperature Converter! \n" +
				"Enter 0 to convert F --> C and 1 to convert from C --> F. \n" +
				"Enter Control-Z when done! \n>"); //Startup
		int input = stdin.nextInt(); //Which converter
		
		if (input == 0){ //F->C
				while(stdin.hasNext()){
					tF = stdin.nextDouble();
					tC =  ((tF-32.0)*5.0)/9.0;
					System.out.println(tF+"F = "+ tC+"C");
				}
		}
		else { //C->F
			while(stdin.hasNext()){
				tC = stdin.nextDouble();
				tF = ((tC*9.0)/5.0)+32;
				System.out.println(tC+"C = "+ tF+"F");
			}
		}
 	}
 }
