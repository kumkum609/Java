package mypack;
class Balance{
    String name;
    double balance;
    Balance(String n, double b){  // COnstructor
        name = n;
        balance = b;

    }
    void show() {
        if(balance < 0)
            System.out.println("---------->");
        System.out.println(name + " " + balance);
    }
}

public class MyPackage {
    public static void main(String[]args){

        Balance current[] = new Balance[3];
        current[0] = new Balance("Ram ", 999.5);
        current[1] = new Balance("Lakshh ", 10025.0);
        current[2] = new Balance("Harish", 6648.45);
        for(int i= 0; i<=2; i++)
            current[i].show();
    }
}