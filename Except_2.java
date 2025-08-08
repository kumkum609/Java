public class Except_2 {
    public static void main(String[] args) {
        String str = "Example";
        //Error: StringIndexoutofBoundsException
       // System.out.println(str.charAt(-1)); --> Error
       System.out.println(str.charAt(0)); //E

       //Error: ArrayIndexoutofBoundsException
       int a[] ={10,20,30}; //a[3]
       //Index 5 out of bounds 
      // System.out.println(a[5]);
      System.out.println(a[1]);
    }
    
}
