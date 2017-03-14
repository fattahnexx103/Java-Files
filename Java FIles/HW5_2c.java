public int[] summit(int[] gamma, int[] delta){
	if (gamma.length == delta.length) {
		int[] sum = new int[gamma.length];
		for(int i = 0; i < sum.length; i++){
			sum[i] = gamma[i] + delta[i];
		}
		return sum;
	}
	else if (gamma.length < delta.length){
		int[] short5 = new int[gamma.length];
		for(int i = 0; i < short5.length; i++){
			short5[i] = 5;
		}
		return short5;
	     }
	      else{
		  int[] short5 = new int[delta.length];
	      		for(int i = 0; i < short5.length; i++){
				short5[i] = 5;
			}
		   return short5;         	
	      }
}