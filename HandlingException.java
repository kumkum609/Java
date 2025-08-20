public class HandlingException {
    public static void main(String[] args) {
        /*int a[] = new int[2];
        System.out.println(a[3]);
        this will throw an error ArrayIndexOutOfBoundsException*/
        try{
            int a[] = new int[2];
            System.out.println(a[3]);
            }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception thrown:" +e);

       }
       finally{
       System.out.println("Out of block");
    }
    }
    
}
