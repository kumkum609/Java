//java program for inter thread communication


class Customer{
    int amount = 10000;
    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw.....");
        if(this.amount<amount){    //10000<15000
            System.out.println("Less balance; Waiting for deposit"); //will print
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        this.amount-=amount;  //10000-15000 =-5000
        System.out.println("Withdraw completed   " +this.amount);
    }
    
    synchronized void deposit(int amount){
        System.out.println("Going to deposit....");//print
        this.amount+=amount;
        System.out.println("Deposit completed");
        notify();
    }
}
public class ThreadCommunicationEg {
    public static void main(String[]args){
   final Customer c = new Customer(); 
   new Thread(){
    public void run(){
        c.withdraw(15000);
}
}.start();
    new Thread(){
        public void run(){
            c.deposit(10000);

        }

    }.start();

   }
    }
    

