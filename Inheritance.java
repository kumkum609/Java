// inheritane in java
class shape {
    public void area(){
        System.out.println(" display area");
    }
}

// child class which extends the parent class shape

class Triangle extends shape{
    public void area(int l , int h ){
        System.out.println(" Triangle area =" +0.5 *l*h);
    }
}

class circle extends shape{
    public void area(int r){
        System.out.println(" Circle area = " +3.14 * r * r);
    }
}

 // this is the main method wher the program execution starts

public class Inheritance {
 public static void main(String[]args){
    Triangle t = new Triangle();
    circle c = new circle();
t.area(10, 30);
    t.area();
    c.area(5);
    c.area();
 }   
}
