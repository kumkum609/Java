
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //convert the value kilometre into metre
        System.out.printf("Enter the value in Kilometre:");
     Scanner sc=new Scanner(System.in);
     float a= sc.nextFloat();
     float convert=a*0.621371f;
        System.out.println("Miles:"+convert);


    }
}