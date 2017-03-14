import java.util.*;
public class DictionaryManager {
   public static void main(String[] args) {
      Book[] books = new Book[10];
      books[0] = new Book(50, "Book");
      books[1] = new Dictionary(500, 3000, "Dictionary");
      books[2] = new Book(100, "Book");
      books[3] = new Dictionary(600, 5000, "Dictionary");
      books[4] = new Dictionary(400, 2000, "Dictionary");
      int numBooks = 5;
      numBooks = add(books, numBooks);
      for (int i = 0; i < numBooks; i++)
         System.out.println(books[i].getPages());
   }
   
   // Define a method called add that takes an array of books as parameter, asks
   // the user for necessary information about a book or a dictionary and adds 
   // the corresponding object based on that information to the array and returns 
   // the new number of books.
   public static int add(Book[] b, int num) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Book type:");
      String type = scan.nextLine();
      System.out.println("Number of pages:");
      int pages = scan.nextInt();
      if (type.equals("Dictionary")) {
         System.out.println("Definitions:");
         int definitions = scan.nextInt();
         b[num] = new Dictionary(pages, definitions, type);
      }
      else {
         b[num] = new Book(pages, type);
      }
      return num + 1;
   }
}