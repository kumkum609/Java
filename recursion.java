public class recursion {

    //Calculate factorial of a number by recursion
    //factorial (n)=factorial (n-1)

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println("The value of factorial n is:" +factorial(n));
    }
}