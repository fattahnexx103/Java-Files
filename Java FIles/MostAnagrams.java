public static String MostAnagrams(ArrayList<String> words){
   int max = 0;
   int index = 0;
   String word = null;
      ArrayList<String> sameLength = new ArrayList<String>();
      ArrayList<String> anagrams = new ArrayList<String>();
            ArrayList<String> lettersOfWord = new ArrayList<String>(); 
                  for(int i :words){ 
                  sameLength.clear(); 
                  lettersOfWord.clear();
                  anagrams.clear();
                  word = words.get(i); 

                  for(int j;j<words.size();j++) 
                  if((word.length())==(words.get(j).length())&&j!=i) 
                        sameLength.add(words.get(j)); 
                    
                  for(int k:word) 
                  lettersOfWord.add(word.substring(k,k+1)); 

                  for(int l = 0;l<sameLength.size();l++){ 
                  String ot herWord = sameLength.get(l);  

            ArrayList<String> lettersOfOtherWord = new ArrayList<String>(); 
                  for(int m:otherWord) 
                  lettersOfOtherWord.add(otherWord.substring(m,m+1)); 
 
      
                  for(String letter : lettersOfWord) 
                     if(lettersOfOtherWord.indexOf(letter)!=-1) 
                     lettersOfOtherWord.remove(lettersOfOtherWord.indexOf(letter)); 
                     if(lettersOfOtherWord.isEmpty()) 
                     anagrams.add(otherWord);	
}
          anagrams.add(word); 
            if(anagrams.size()>max){ 
            max = anagrams.size(); 
             index = i; 
      }
      }
         return words.get(i); 
}
} 
