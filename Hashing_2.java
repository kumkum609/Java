import java.util.*;
public class Hashing_2  {
    public static void main(String[]args){
        HashMap<String,Integer> map = new HashMap<>();
        //Student name, Id no.
        map.put("Tony", 520);
        map.put("John", 963);
        map.put("Alice", 789);
        //System.out.println(map);
        for(Map.Entry<String,Integer> e :map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
        }

        //remove
        map.remove("Alice");
        System.out.println(map);
    }
}
