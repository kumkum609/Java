import java.util.Scanner;

public class Dowhile_loop {
    public static void main(String[] args) {
        //Print number by do-while loop
     /*  int a=0;
        do{
            System.out.println(a);
            a++;
        }
       while(a<=6);*/

        //Print number--> User define

        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the value of i:");
        i=sc.nextInt();
        System.out.println("Enter the value of n:");
        n=sc.nextInt();

        do{
            System.out.println(i);
            i++;
        }

        while(i<=n);

    }
}