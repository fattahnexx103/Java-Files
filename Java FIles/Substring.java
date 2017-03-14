public class Substring{

   public static void main(String[] args){
   
   String s ="buckyrobertsbuckyroberts";
   
   System.out.println(s.indexof('k',5));//searchs first index of k
   //5 means look at k but ignore the first 5 characters
   System.out.println(s.indexof("rob"));//rob starts at 5
   
   String a = "Bacon ";
   String b = "monster";
   System.out.println(a.concat(b));
   
   //replace
   System.out.println(a.replace("B","F"));//replace B in bacon with F
   System.out.println(b.toUpperCase());//converts word to upper case
   System.out.println(b.trim());//shortens "  monster  " to "monster"
   }

}