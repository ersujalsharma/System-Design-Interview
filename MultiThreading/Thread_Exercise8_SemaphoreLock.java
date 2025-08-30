package MultiThreading;

import java.util.concurrent.Semaphore;

public class Thread_Exercise8_SemaphoreLock {
    public static void main(String[] args) {
        SharedResouceSemaphore sharedResouceSemaphore = new SharedResouceSemaphore();
        Thread thread1 = new Thread(()->sharedResouceSemaphore.produce());
        Thread thread2 = new Thread(()->sharedResouceSemaphore.produce());
        Thread thread3 = new Thread(()->sharedResouceSemaphore.produce());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class SharedResouceSemaphore{
    boolean isAvailable = false;
    Semaphore semaphore = new Semaphore(1);
    public void produce(){
        try {
            semaphore.acquire();
            System.out.println("Producer Aquired Lock" + Thread.currentThread().getName());
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Producer Released Lock" + Thread.currentThread().getName());
        semaphore.release();
    }
    public void consumeItem(){
        System.out.println("Consumer Aquired Lock" + Thread.currentThread().getName());

        System.out.println("Consumer Released Lock" + Thread.currentThread().getName());
    }
}
