import java.util.*;
public class StackEg_1{
    public static void main(String[]args){
Stack<Integer> st = new Stack<Integer>();
// push

st.push(10);
st.push(20);
st.push(30);
st.push(40);
System.out.println("Popped element is: "+st.pop() );
System.out.println("Peek element is: "+st.peek());
Integer position = st.search(20);
System.out.println("Position of element is: "+position);
    }
    
}
