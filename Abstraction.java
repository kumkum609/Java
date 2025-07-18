abstract class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    public void sound(){
     
        System.out.println("Dog sound = Dog Barks");
    
      }
    }


class Horse extends Animal{
    public void sound(){
    
System.out.println("Horse sound =  Horse Neighs");
    }
}
public class Abstraction {
    public static void main(String[]args){
Horse horse = new Horse();
Dog dog = new Dog();
horse.sound();
dog.sound();
    }
    
}
