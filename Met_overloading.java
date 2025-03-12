public class Met_overloading {

    static void foo(){
        System.out.println("Good morning!");
    }
    static void foo(int a){
        System.out.println("Good morning!" +a);
    }

    public static void main(String[] args) {

        foo();
        foo(a:300);

    }
}