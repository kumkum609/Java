public class TryCatch{
    public static void main(String[] args) {
    try{
        System.out.println("Open files");
        int n =args.length;
        System.out.println("n = " +n);
        int a = 45/n; //ArithmeticException
        System.out.println("a = " +a);
        int b[]={10,20,30};
        System.out.println(b[50]); //ArrayIndexOutOfBoundsException

    }
    catch(ArithmeticException ae){
        System.out.println(" Pass the Correct data " +ae);
    }
    catch(ArrayIndexOutOfBoundsException aie){
        aie.printStackTrace();
        System.out.println("Access the correct index " +aie);
    }
    finally{
        System.out.println("Close the files");
    }
    }
}