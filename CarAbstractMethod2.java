abstract class car{
    void openTank(){
        System.out.println(" Fill the tank");
    }

    abstract void steering();
    abstract void brake();
}

// consider sub class of car
class Maruti extends car{
    void steering(){
        System.out.println(" Steering = Ordinary steering");
    }
    void brake(){
        System.out.println(" Brake = Hydraulic brake ");
    }
}

class Santro extends car{
void steering(){
    System.out.println(" Steering = Power steering");

}
void brake(){
    System.out.println(" Brake = Disc brake ");
}
}

//consider main class
public class CarAbstractMethod2 {
    public static void main(String[]args){
        Maruti m = new Maruti();
        Santro s = new Santro();
car ref;
ref = m;
System.out.println("Maruti car-->");
ref.openTank();
ref.steering();
ref.brake();
System.out.println("________________________");

ref = s;
System.out.println("Santro car -->");

ref.openTank();
ref.steering();
ref.brake();


    }
    
}
