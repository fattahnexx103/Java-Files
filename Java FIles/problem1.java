import java.util.Scanner;
import java.util.*;
public class problem1{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      String inputstring = input.nextLine();
      String finalstring = "";
      int[] numbersarray = new int[inputstring.length()];//creates indexing array
		char[] chararray = new char[inputstring.length()];//creates character array
      
      for(int i = 0; i<inputstring.length();i++){
			numbersarray[i] = (int) inputstring.charAt(i);//stores letter to be processed
		}
		for(int i=0;i<numbersarray.length;i++)
			numbersarray[i] += 3;//character gets added by 3 digits forward
		for(int j=0;j<chararray.length;j++){
			chararray[j] = (char) numbersarray[j];
			finalstring += chararray[j];
		}
      System.out.println(finalstring);

      
      
      
      
      
      }

}