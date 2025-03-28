public class multiply {

    //Write a program to print multiplication


    static void multiplication(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d=%d", n, i, n * i); //7 X 1=7....7 X 7=70

        }

    }

    public static void main(String[] args) {


        multiplication(7);


    }

}