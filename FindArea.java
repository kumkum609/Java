class rectangle{
    int length;
    int breadth;


public void insert(int l , int b){
    length = l;
    breadth = b;

}

 public void ComputeArea() {
    System.out.println("Area of rectangle is :" + (length * breadth));
    
}
}

public class FindArea  {
    public static void main(String[]args){
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();
        r1.insert(5, 12);
        r2.insert(10,30);
        r1.ComputeArea();
        r2.ComputeArea();
    }
    
}
