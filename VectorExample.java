import java.util.*;
public class VectorExample {
    public static void main(String[]args){
   Vector<Integer> v = new Vector<>();
    int x[] = {10,20,30,85,95,105};
      //Add elements from array to the vector
    for(int i = 0;i <x.length; i++){
        v.add(x[i]);
    }
   
    System.out.println("Vector Elements:" );
    for(int i =0; i<v.size(); i++)
     //get--> get method obtain the elements from the vector
    System.out.print(v.get(i) +", ");

    }
    
}
