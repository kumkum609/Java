import java.util.ArrayList;
import java.util.Iterator;
public class Iterting_Array {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");
        // using while loop for iteration
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
