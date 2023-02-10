import java.util.*;
import java.util.Arrayllist 

public class StudyAtHome
{
   public static void main(String[] args)
   {
       // Rewrite this code to use an ArrayList instead of an array
//        String[] toDoList = new String[3];
//        toDoList[0] = "Review the lessons";
//        toDoList[1] = "Drink water";
//        toDoList[2] = "Work on the lab";
         ArrayList<String> toDoList = new ArrayList<String>(); 
         listStrings.add("Review the lessons");
         listStrings.add("Drink water"); 
         listStrings.add("Work on the lab"); 
      System.out.println(toDoList);
         
       // changing element 1
         listStrings.set(1, "Do the Homeworks");
         System.out.println(toDoList) 
//        toDoList[1] = "Do the homeworks";

       System.out.println(toDoList.size() + " things to do!");
       System.out.println("Here's the first thing to do: "
           + toDoList.get(1));

       // remove item 0 and move everything down
       //  (this can be done in 1 command with ArrayList)
      toDoList.remove(0);
      
//        toDoList[0] = toDoList[1];
//        toDoList[1] = toDoList[2];
//        toDoList[2] = "";
           System.out.println("Here's the next thing to do: " + toDoList.get(0))
//        System.out.println("Here's the next thing to do: "
//            + toDoList[0] );

   }
}
