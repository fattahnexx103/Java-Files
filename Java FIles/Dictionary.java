public class Dictionary extends Book {
   private int definitions;
   
   public Dictionary(int p, int def, String bookType) {
      super(p, bookType);
      definitions = def;
   }
   
   public int getPages() {
      System.out.println("Child class");
      return pages;
   }
      
   public int getDefinitions() {
      return definitions;
   }
   
   public double computeRatio() {
      return (double) definitions / pages;
   }
   
   public String toString() {
      return super.toString() + " with " + definitions + " definitions"; 
   }

}