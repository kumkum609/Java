abstract class Animal {

    // Default move method
    public void move() {
      System.out.println("This animal moves forward");
     }

   // Default speak method

    public void speak() {
      System.out.println("This animal speaks");
      }
   }

    // Flying interface
     interface Flying {
     void fly();

}
     // Goose class - an Animal that can fly
     class Goose extends Animal implements Flying {
                  @Override
            public void move() {
            System.out.println("This goose moves forward");

    }
                 @Override

            public void speak() {
             System.out.println("This goose speaks");
             }

                @Override

            public void fly() {
            System.out.println("This goose is flying");
       }

}
           // Lynx class - an Animal that does NOT fly
       class Lynx extends Animal {
     @Override

    public void move() {
        System.out.println("This lynx moves forward");
        }

     @Override
      public void speak() {
      System.out.println("This lynx speaks");
    }

}

       // Airplane class that is Flying but not an Animal

      class Airplane implements Flying {

      @Override
       public void fly() {
       System.out.println("The airplane is flying");
      }
   }
      // Test class with main method
      public class AnimalTest {
     public static void main(String[] args) {
      Animal goose = new Goose();
      Animal lynx = new Lynx();
      goose.move();  // This goose moves forward
      goose.speak(); // This goose speaks
       lynx.move();   // This lynx moves forward
      lynx.speak();  // This lynx speaks
      // Flying interface variables
      Flying flyingGoose = new Goose();
     Flying airplane = new Airplane();
      flyingGoose.fly(); 
      airplane.fly();   

    }

}


