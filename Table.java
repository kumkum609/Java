import java.util.Scanner;
public class Table{
    public static void main(string[]args){
        Scanner input=new Scanner(System.in);

        //Display multiplication in java--> Table
        int number;
        System.out.println("Enter the Value of number :");
        number=input.nextInt();

        //Using for loop
        for(int i=1;i<=10;i++){
          System.out.printf("%d X %d = %d"\n,number,i,number*i);  
        }

    }
    
}
