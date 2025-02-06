import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("1=Rock\n 2=Paper\n 3=Scissor");
        System.out.println("It's your turn:");
        int choice=sc.nextInt();
        int computer=rand.nextTnt();
        System.out.println("Computer choice is:"+computer);
        if(choice==computer){
            System.out.println("Draw");
        }
        else if (choice==1 && computer==2) {
            System.out.println("Computer win");
        }
        else if (choice==1 && computer==3) {
            System.out.println("You win");
        }
        else if (choice==2 && computer==1) {
            System.out.println("You win");
        }
        else if (choice==2 && computer==3) {
            System.out.println("Computer win");
        }
        else if (choice==3 && computer==1) {
            System.out.println("Computer win");
        }
        else if (choice==3 && computer==2) {
            System.out.println("You win");
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}