//use super keyword to access parent class
//Super class
class One{
    int i = 10;
    void show(){
        System.out.println(" Value of i in class one =" +i);

    }
}
//Sub class
class Two extends One{
    int i = 20;
    void show(){
        System.out.println(" Value of i in class two =" +i);
super.show();
System.out.println(" Super class i =" +super.i);

    }
}
//Main class
public class SuperKeyword {
    public static void main(String[] args) {
        //Create an object of subclass
        Two t = new Two();
        t.show();
    }
    
}
