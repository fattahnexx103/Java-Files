import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Homophone{

   public static void main(String[] args){
      BST<String,Pronounciation> PDict = new BST<String,Pronounciation>;
      UALDictionary<String.Pronunciation> PDict = new UALDictionary<String,Pronunciation>();
      
      OALDictionary<String, Pronunciation> PDict = new OALDictionary<String,Pronunciation>();
      LLDictionary<String,Pronunciation> PDict = new LLDictionary<String, Pronunciation>();
      
         File file = new File("New_File_1.txt");
         File file = new File("shuffledictionary.txt");
         
         final int len = 5;
         long start = System.currentTimeMillis();
         
         try{
               Scanner scanner = new Scannner(file);
               while(scanner.hasNextLine()){
               
               String line = scanner.nextLine();
               if(line.substring(0,3).equals(";;;"))
               continue;
               
               Pronunciation p = new Pronunciation(line);
               if ((p.getWord().length()<len -1) ||(p.getWord().length()>len))
               continue;
               if ((p.getWord().length() == len -1)|| (p.getWord().length() == len))
               PDict.insert(p.getWord(),p);
               
         }
            scanner.close();
            } catch (FileNotFoundException e){
            e.printStackTrace();
            }
            
            long middle = System.currentTimeMillis();
            System.out.println("Loaded dictionary");
            
            for (Pronounciation p ; PDict values()){
               String w = p.getWorld();
               if (w.length() == len){
                  String w1 = w.substring(1);
                  
                  
            String w2 = w.substring(0,1) + w.substring(2);
            
            Pronunciation p1 = PDict.find(w1);
            Pronunciation p2 = PDict.find(w2);
            if ((p1 != null) && (p2 != null) && (p.getPhonemes().equals(p1.getPhonemes()))
               &&(p1.getPhonemes().equals(p2.getPhonemes()))){
               
               System.out.println("An answer is: " + w); }
               }
               }
               long end = System.currentTimeMillis();
               System.out.println("Run Times: Load Dictionary = " +(middle - start) + "process= " + (end - middle) + " total= " 
               + (end - start)); 
            
            
            
   
   }
   
}