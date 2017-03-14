public class Collection{

public static void main(String[] args){
//dynamic lists are collections
   String[] things = {"eggs","lasers","hats","pie"};
   List<String> list1  = new ArrayList<String>();
//we need to specify datat type for list <String>
//add array items to list
for(String x:things) 
   list1.add(x);


String[] morethings = {"lasers","hats"};
//we run a check
List<String>list2 = new ArrayList<String>();
}

//add array items to list
for(String y:morethings)
   list2.add(y);

for(int i =0;i<list2.size();i++){
System.out.prtinf("%s",list2.get(i));
}
//take out element from list
editlist(list1.list2);
System.out.println();

//print list1
for(int i =0;i<list1.size();i++){
System.out.prtinf("%s",list1.get(i));
}
}
public static void main editlist(Collection<String>L1,Collection<String>L2){
//Iterator goes through each list item by item
   Iterator<String> it = L1.iterator();//loops through list1
   while(it.hasNext())//loop through until u reach end
      if(L2.contains(it.next()))//if l2 contains anything that we loop through in l1
         it.remove();
}
//eggs lasers hats pie
//eggs pie