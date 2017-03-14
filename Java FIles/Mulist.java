import java.awt.*;

//we create multiple selection list
//things on the left are switched to the right

public class Mulist extends JFrame{

   private JList leftlist;
   private JList rightlist;
   private JButton movebutton;
   private static String[] foods = {"bacon","wings","ham","beef","more bacon"};
   
  
  public Mulist(){
   super("The Title");
   setLayout(new FlowLayout());
   
   leftlist = new JList(foods);
   //list with foods in it
   leftlist.setVisibleRowCount(3);//see 3 items by default
   leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
   add(new JScrollPane(leftlist));//puts a scrollbar on list
   
   movebutton  = new JButton("Move");
   movebutton.addActionListener(
      new ActionListener(){
         public void actionPerformed(ActionEvent event){
            rightlist.setListData(leftlist.getSelectedValues());
         }//whenever we select left list item, it adds to an array
      }
   );
   add(movebutton);
   
   //create the list on right
   rightlist = new JList();//we dont want any thing in it so null in parameter
   rightlist.setVisibleRowCount(3);
   rightlist.setFixedCellWidth(100);
   rightlist.setFixedCellHeight(15);
   //displays the empty right list
   rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
   add(new JScrollPane(rightlist));

   }
  
  
  
  
   }
   
     
   