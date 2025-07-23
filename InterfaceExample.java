interface  Animal{
    void sound();
    void eat();
    void walk();
    void sleep();
}
class Dog implements Animal{
    
    // Dog class implements Animal interface
    public void sound(){
        System.out.println("Dog sound : Bark");
    }
    public void eat(){
        System.out.println("Dog is  carnivorous & also Herbivorous");
    }
    public void walk(){
        System.out.println(" Dog walks on four legs");
    }
    public void sleep(){
        System.out.println("Dog sleeps for 12 - 14 hours a day");
    }

}
class Horse implements Animal{
    
    // Horse class implements Animal interface
    public void sound(){
        System.out.println("Horse sound : Neigh");
    }
    public void eat(){
        System.out.println("Horse is Herbivorous ");
    }
    public void walk(){
        System.out.println(" Horse walks on four legs");
    }
    public void sleep(){
        System.out.println("Horse sleeps for 4-6 hours a day");
    }
    
}
public class InterfaceExample {
    public static void main(String[]args){
        //creating objects of dog and horse
        Animal Dog = new Dog();
        System.out.println("Activities of Dog");
        Dog.sound();
        Dog.eat();
        Dog.walk();
        Dog.sleep();
        
        System.out.println("-------------------");

        Animal Horse = new Horse();
        System.out.println("Activities of Horse");
         Horse.sound();
        Horse.eat();
        Horse.walk();
        Horse.sleep();


    }
    
}
