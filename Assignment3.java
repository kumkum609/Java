import java.util.Scanner;
import java.util.Vector;
public class Assignment3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Vector<Integer> aGrades = new Vector<>();
        Vector<Integer> bGrades = new Vector<>();
        Vector<Integer> cGrades = new Vector<>();
        Vector<Integer> dGrades = new Vector<>();
        Vector<Integer> fGrades = new Vector<>(); 
        while (true) {
            System.out.println("Enter a grade between 0 and 100 or -1 to quit:");
            int grade = input.nextInt();
            if(grade==1){
                break;
            }
            if(grade==-1){
                break;
            }
           
             else if(grade>=80){
                bGrades.add(grade);
            }
             if(grade>=70){
                cGrades.add(grade);
            }
             if(grade>=60){
                dGrades.add(grade);
            }
        else{
            fGrades.add(grade);
        }
        int totalGrades = aGrades.size()+ bGrades.size()+ cGrades.size()+dGrades.size()+fGrades.size();
        System.out.println("\n Total number of grades= " +totalGrades);
        System.out.println("Number of A= " +aGrades.size());
        System.out.println("Number of B= " +bGrades.size());
        System.out.println("Number of C= " +cGrades.size());
        System.out.println("Number of D= " +dGrades.size());
        System.out.println("Number of F= " +fGrades.size());
        input.close();
        }
        
    }
    
}
