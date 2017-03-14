class MilitaryRegularTime
{
   public static void main(String[] args)
   {
      Timeclass setTimeobject = new Timeclass();
      System.out.println(setTimeobject.toMilitary()); // prints out default time which was 00:00:00
      setTimeobject.setTime(13,27,26); // set values to the time
      System.out.println(setTimeobject.toMilitary()); // print out the time
      System.out.println(setTimeobject.toRegular());
      setTimeobject.setTime(13,27,6);
      System.out.println(setTimeobject.toMilitary()); // print out the time
      System.out.println(setTimeobject.toRegular());
      
   }
}