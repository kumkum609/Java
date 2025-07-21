class Access{
    public int a =10;
    protected int b =20;
    int c = 30;// default access
    private int d = 40;
    //These all modifiers can be used to access in same class
    public void display(){
        System.out.println("Values of variables:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}

public class Specifiers{
    public static void main(String[] args) {
       Access acc = new Access();
       acc.display(); 
    }
}