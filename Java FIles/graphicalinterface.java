import javax.swing.JOptionPane;//this is the class we need to create graphics

class graphicalinterface{
   public static void main(String[] args)
   {
    
      String fn = JOptionPane.showInputDialog("Enter First Number");
      String sn = JOptionPane.showInputDialog("Enter Second Number");
      //showinputdialogue only stores strings
      
      //now we convert the input into integars
      int num1 = Integer.parseInt(fn);//converts String 5 to number 5
      int num2 = Integer.parseInt(sn);
      int sum = num1 + num2;
      
      
      JOptionPane.showMessageDialog(null,"The answer is "+sum,"the title",JOptionPane.PLAIN_MESSAGE);
      
   //null positions at center of screen
   
   
   }



}