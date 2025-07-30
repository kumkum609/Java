import java.util.*;
public class FindAndRemove {
public static void main(String[]args){
    ArrayList<String> list = new ArrayList<>();
    list.add("Black");
    list.add("Blue");
    list.add("Red");
    list.add("Violet");
    list.add("Purple");
    System.out.print("Original list: " +list);

    //Now count the number of elements in list
    int count = list.size();
    System.out.println("\nNumber of elements in Original list: " +count); //5

    //Remove the element at index '3'
    list.remove(3);
    System.out.println("<-----Element at index 3 removed------>");
    System.out.println("New list =" +list);

    int newcount = list.size();
    System.out.println("Number of elements in new list: " +newcount); //4
   
   
    /*list.remove("Purple");
    System.out.println(list);*/
  }
}
