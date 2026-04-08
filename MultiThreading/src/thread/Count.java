package thread;

public class Count extends Thread {

    int count = 0;

    public synchronized void increment(){
        count++;
    }
    public synchronized void decrement(){
        count--;
    }
}