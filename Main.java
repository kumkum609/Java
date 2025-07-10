import java.util.Scanner;
//GCD of two given numbers by recursion method

public class Main {
    public static int gcd(int num1,int num2){
        if(num2!=0)
        return gcd(num2,num1%num2);
        else
        return num1;

    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of 1st number:");
        int a=input.nextInt();
        System.out.println("Enter the value of 2nd number:");
        int b=input.nextInt();
        int result=gcd(a,b);
        System.out.println("Result is=" +result);
    }
}
