class A{
    public interface NestedIf{
        boolean isNotNegative(int x);
    }
}
class B implements A.NestedIf{
    public boolean isNotNegative(int x){
        return x<0? false : true;
    }
}

public class NestedInterface {

    public static void main(String[]args){
A.NestedIf nif = new B();
if(nif.isNotNegative(12))
System.out.println(" 12 is not negative");
else 
System.out.println("Negative number");
    }
}
