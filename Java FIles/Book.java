public class Book {
   protected int pages;
   protected String bookType;
   
   public Book(int pages, String bookType) {
      this.pages = pages;
      this.bookType = bookType;
   }

   public int getPages() {
      System.out.println("Parent class");
      return pages;
   }
   
   public void setPages(int p) {
      pages = p;
   }
   
   public String toString() {
      return "Book with " + pages + " pages";
   }
}