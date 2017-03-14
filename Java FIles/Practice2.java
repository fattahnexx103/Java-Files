/*
  Write an application that reads numbers from a file in the same format as
  Data3.txt and prints to the screen the total number of odds.
*/

import java.util.*;
import java.io.*;

public class Practice2 {
   public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
      File inputFile = new File(args[0]);
      Scanner scan = new Scanner(inputFile);
      int size = scan.nextInt();
      int[] data = new int[size];
      
      // Populate array data
      for (int i = 0; i < data.length; i++) {
         data[i] = scan.nextInt();
      }
      
      // Calculate how many odd numbers data has
      /*int count = 0;
      for (int i = 0; i < data.length; i++) {
         System.out.println(data[i] + " " + data[i] % 2);
         if (data[i] % 2 == 1 || data[i] % 2 == -1) {
            count++;
            System.out.println(data[i] + " is odd");
         }
      }*/
      
      // Check if 5 exists in Data3.txt
      boolean flag = false;
      for (int i = 0; i < data.length; i++) {
         if (data[i] == -1) {
            flag = true;
            System.out.println("-1 is in Data3.txt");
         } 
      }
      
      if (!flag) 
         System.out.println("-1 is not there");
   }
}