import java.util.*;

public class Hashing {
  public static void main(String[]args){
   
    //Student name,Id no.
    HashMap<String,Integer> map = new HashMap<>();
    //Insertion operation
    map.put("Alice",  74);
    map.put("Tony",  20);
    map.put("John", 596);
    System.out.println(map);
    //update
    map.put("Alice", 865);
    System.out.println(map);
   //Search operation
   if(map.containsKey("John")){
    System.out.println("Key is present in map");
   }
   else{
    System.out.println("Key is not present in the map");
   }
   System.out.println("Tony value=");
System.out.println(map.get("Tony"));

  }  
}
