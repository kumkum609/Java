class A{
    void method1(){
        try{
        String str ="Hello";
        char ch = str.charAt(5); //No character at index 5
        }
        catch(StringIndexOutOfBoundsException sie){
            System.out.println("Please check the index value");
            throw sie;
        }
    }
}
public class RethrowException {
    public static void main(String[]args){
    A a =new A();
    try{
        a.method1();
    }
    catch(StringIndexOutOfBoundsException sie){
        System.out.println("Caught rethrow Exception");
    }
    }
}
