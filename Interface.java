//interface in java
interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);

}
// implementing the bicycle interface 
//in interface implements keyword is used
 
class AvonCycle implements Bicycle{
    int speed = 7;

    //Implementing the applybrake method
   public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println("Speed after applying brake:" +speed);

    }
    // Implementing the speedup method
   public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("Speed after speeding up:" +speed);
    }
}

public class Interface {
    public static void main(String[]args){
        //creating an object of subclass 

        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(5); //2
        cycle.speedUp(10); //12 

        //printing the final speed
        System.out.println("Final speed of the cycle is :" +cycle.speed);


    }
    
}
