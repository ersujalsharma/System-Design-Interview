package MultiThreading;

public class Thread_Exercise2_Join_Deamon {
    public static void main(String[] args) {
        System.out.println("Main Thread start....");
        Thread thread1 = new Thread(new Producer1());
        thread1.setDaemon(true);
        Thread thread2 = new Thread(new Producer1());
        Thread thread3 = new Thread(()->{
            System.out.println("Thread 3 starts");
            try {
                Thread.sleep(10000l);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Thread 3 Stopped..");
        });
        thread3.setDaemon(true);
        // Deamon thread will stop working if all threads are stopped, though it is in any state.
        thread1.start();
        // to stop executing next line till current thread is not completed yet,
        // use join
        // try {
        //     thread1.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        thread2.start();
        // try {
        //     thread2.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        thread3.start();
        // while (thread3.isAlive()) {
        //     System.out.println("Thread 3 is working Cause I am deamon, i'll die after all////" + thread2.isAlive() +" " + thread1.isAlive() +" " + Thread.currentThread().isAlive());
        // }
        System.out.println("Main thread closed.");
    }
}
class Producer1 implements Runnable{
    public  synchronized void test(){
        // try {
        //     Thread.sleep(2000l);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        System.out.println("Thread is Entering...."+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Producig task"+Thread.currentThread().getName());
        try {
            Thread.sleep(8000l);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        test();
        System.out.println("ProducedTask"+Thread.currentThread().getName());
    }
    
}
