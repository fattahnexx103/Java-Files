import java.util.*;
public class BusyActor{

   public static void main(String[] args) throws IOException{
   ActorList actorlist = new ActorList("actors.list.gz");
   int max = 0;
   int actorIndex = 0;
   
   for(int i = 0;i<1;i++){
      int current = actorlist.actors.get(i).movieCount():
      
    if(max <current)
    {
    max = current;
    actorIndex = i;
    }
    
   }
   System.out.println(actorlist.actors.get(actorIndex)+max);
   }
   
   
   
   }