package thread;

public class Account extends Thread {

    String name;
    int accno;
    int amount;

    public Account(String name, int accno, int amount) {
        this.name = name;
        this.accno = accno;
        this.amount = amount;
    }

    public synchronized void deposite(int de){
        System.out.println("before d : " + this.amount);
        this.amount = this.amount+ de;
        System.out.println("after d : " + this.amount);

        notify();
    }
    
    public synchronized void withdraw(int we){

        try{
            wait();
            System.out.println("wait");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("before w : " + this.amount);
        this.amount = this.amount -  we;
        System.out.println("after w : " + this.amount);

    }
}