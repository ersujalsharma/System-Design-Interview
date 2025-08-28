package MultiThreading;

public class Thread_Execise3_LearningSychronization {
    public static void main(String[] args) {
        SharedResouce2 sharedResouce = new SharedResouce2();
        Thread t1 = new Thread(new ProducedTask2(sharedResouce));
        Thread t2 = new Thread(new ProducedTask2(sharedResouce));
        // Thread t2 = new Thread(new ProducedTask2(new SharedResouce2()));
        t1.start();
        t2.start();
    }
}

class ProducedTask2 implements Runnable{

    SharedResouce2 sharedResouce;
    public ProducedTask2(SharedResouce2 sharedResouce){
        this.sharedResouce = sharedResouce;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        sharedResouce.method1();
    }

}

class SharedResouce2 {

    public synchronized void method1(){
        System.out.println("Thread - is - working.........." + Thread.currentThread().getName());
        try {
            Thread.sleep(2000l);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Thread closed");
    }
    
}