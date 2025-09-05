import java.util.Scanner;
import java.util.Random;

 /* In this program I creted a number gussing game where user have to guess a number between 1 to 10
 1. Taken UserInput
 2. isCorrectNumber -- to check the number is correct or not
 3. only  5 attempts */

class Game{
    int a; //User input number
    int b; //Random number
    int guess=0;

    public Game(){ 
       
        Random r = new Random();
        b =r.nextInt(10);
    }
    

  public void takeUserInput(){ 
       Scanner sc = new Scanner(System.in);
       System.out.print ("Enter the number between 1 to 10 :   ");

       a = sc.nextInt();
       System.out.println("You entered =" +a);
       System.out.println("Random number = " +b);
  }
    public boolean isCorrectNumber(){ 
    //   guess++;
      

        if(a==b){
            System.out.println("Yes you guessed it right " +guess + " times");
            return true;
        }
        else if(a<=b){
            System.out.println("Entered number is smaller, try again");
            return false;
        }
        else{
            System.out.println("Entered number is greater, try again");
            return false;
        }
        
        
    }  
    

    public int getGuess(){ // to get the number of attempts
        return a;
    }   
    
}
public class GuessTheNumber { 
    public static void main(String[]args){ 
     
        Game g = new Game(); 
        g.takeUserInput(); 
        g.getGuess(); 
        g.isCorrectNumber();
        int isAttmempt = 1;
        for(int i=0;i<5;i++){
            g.takeUserInput();
            isAttmempt++;
            if(g.isCorrectNumber()==true){        
                System.out.println("You win the game");
                
                break; 

            }
            if(isAttmempt==5){
            System.out.println("You lose the game in 5 attempts");
            break;
        }
      }
      
    }
    
}
