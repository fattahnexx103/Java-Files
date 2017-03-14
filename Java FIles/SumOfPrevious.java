
public static boolean SumOfPrevious(int n, int[] list){
		if(n < 2){
         return false;
      }
      for(int i = 0; i <= n ; i++){
      for(int j = 1; j <= n; j++){
         if(i == j){
            break;
         }
         System.out.println(list[i]+ " " + list[j] + " " + (list[i]+list[j]) + "  " + list[n] + " " + i + " " + j);
		   if((list[i]+list[j])==list[n]){
		   	return true;
          }
        }
      }
      return SumOfPrevious(n-1, list);	
	}