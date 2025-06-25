import java.util.Scanner;
 class ConvTemp {
    public static void main(String[]args){

        //Convert temperatue --> celsius into Fahrenhit
        double temperatue;
        Scanner input=new Scanner(System.in);
        //Here user input the temperature

        System.out.println("Enter the temprature:");
        temperatue=input.nextDouble();
        temperatue=(temperatue*9/5.0)+32;
        System.out.println("Temperature in Fahrenheit is=" +temperatue);
    }
    
}
