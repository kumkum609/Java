public class sum_even {
    public static void main(String[] args) {

        //Sum of even no.
        //First  4 even no.

        int sum=0;
        int n=4;
        for(int i=0;i<n;i++) {
            sum = sum + (2 * n);
        }
        System.out.println("Sum of first 4 even no. is:");
        System.out.println(sum);
    }
}