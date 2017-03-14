public class problem2 {
	public static void main(String[] args){
		for(int i=100000;i<=999996;i++){ // limits of the integars
		int num = i;
		String pos = Integer.toString(num);
			
      if(pos.substring(2).equals(reverse(pos.substring(2)))){//first condition regarding the 3rd number
		num++; 
		pos = Integer.toString(num);
				
      if(pos.substring(1).equals(reverse(pos.substring(1)))){ // reversing the second number
		num++;
		pos = Integer.toString(num);
		
      if(pos.substring(5).equals(reverse(pos.substring(5)))){ //reversing  second last number
		num++;
		pos = Integer.toString(num);
		
      if(pos.equals(reverse(pos))){
		System.out.println(i);
		break;}
						
      else
		System.out.println(-1);//if the numbers are not palindronic
		}}}
		}
	}
	public static String reverse(String s){//declaring the reverse string method
		String revstring = "";
      
		for(int i=s.length()-1;i>=0;i--){
			revstring += s.charAt(i);}
		
      return revstring;}
      
}
