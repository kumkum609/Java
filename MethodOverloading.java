//This is a java program to demonstrate method overloading
class Maximum {

    // two parameters
    int Max(int a, int b){
        int max;
     if(a > b)
     max = a;
     else
     max = b;
     return max;
    }

    // three parameters
    int Max(int a, int b, int c){
        int max;
        if(a > b && a > c)
        max = a;
        else if(b > a && b > c)
        max = b;
        else
        max = c;
        return max;
    }
}

public class MethodOverloading {
    public static void main(String[]args){
   Maximum M = new Maximum();
   int result1 = M.Max(100,54);
   //Displaying the first result
   System.out.println("Maximum of two number:" +result1);

   int result2 = M.Max(23,56,87);
   //Displaying the second result
   System.out.println("Maximum of three numbers :" +result2);
    }
    
}
