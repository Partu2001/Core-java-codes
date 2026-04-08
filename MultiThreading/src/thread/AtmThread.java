package thread;

public class AtmThread  extends Thread{

	Account a;
    boolean choice;
    int amount= 0;

     AtmThread(Account a, int amount, boolean choice) {
        this.choice = choice;
        this.amount = amount;
    }
    @Override
    public void run(){

        if (choice = true){
            a.withdraw(amount);
        }else {
            a.deposite(amount);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Account a = new Account("Nk", 1000, 0);
        AtmThread a1 = new AtmThread(a, 1000, true);
        AtmThread a2 = new AtmThread(a, 1000, true);
        AtmThread a3 = new AtmThread(a, 1000, true);

        a1.start();
        a2.start();
        a3.start();

        a1.join();
        a2.join();
        a3.join();


    }
}