import java.util.ArrayList;

public class GetndSet_ArrayList {
   public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    list.add("Mango");
    list.add("Apple");
    list.add("Orange");
    list.add("Papaya");
    
    //print the orirginal list
    System.out.print("Original list : " +list);

    //get the element at index 2
    System.out.println("\nElement at index 2 : " +list.get(2));

    //set the element at index 3
    list.set(3, "Banana");

    //print the modified list
    System.out.println("Modified list:");

    for(String fruit: list)
    System.out.print(fruit + ", ");

   } 
}
