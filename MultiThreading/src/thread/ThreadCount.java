package thread;

public class ThreadCount extends Thread {

    Count c = new Count();

    ThreadCount(Count c){
        this.c= c;
    }

@Override
    public void run(){
        for (int i = 0; i<= 10000;i++){
            c.increment();
            System.out.println(c.count);
        }
        for (int i = 0; i<= 10000;i++){
            c.decrement();
            System.out.println(c.count);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Count c = new Count();
        ThreadCount t = new ThreadCount(c);
        ThreadCount t1 = new ThreadCount(c);
        t.start();
        t1.start();

        System.out.println("Total Count is : " + c.count);


    }
}