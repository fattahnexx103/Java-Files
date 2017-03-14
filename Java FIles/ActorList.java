import java.util.ArrayList;
import java.util.*;

public class ActorList{

   ArrayList<ActorRecord> actor;
   
   
public ActorList(String infile) throws IOException{
   RetrieveActors ractors = null;
   
   actor = new ArrayList<ActorRecord>();
   String rawContent;
   while ((rawContent = ractors.getNext()) != null){
   
      String[] content = rawContent.split("@@@");
      ActorRecord actora = new ActorRecord(content[0]);
      for (int i  = 1;i<content.length;i++)
            actora.addMovie(content[i]);
         actor.add(actora);
   


}

}


}