//Checking the given number is Palindrome or not

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 int n,sum=0,r,temp;
System.out.println("Enter the number:");

   n=input.nextInt();   
   temp=n;
   while (n!=0) {
    r=n%10;
    sum=sum*10+r;
    n=n/10;
   }  
   //Here reverse of the given number will be print
   System.out.println("Reverse of the given number is:" +sum);

   if(sum==temp)
   System.out.println("Given number is Palindrome");
   else
   System.out.println("Given number is not a Palindrome");
    }
    
}
