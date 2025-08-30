package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class Thread_Exercise4_ReentrantLock {
    public static void main(String[] args) {
        SharedResouceReentrantLock sharedResouceReentrantLock = new SharedResouceReentrantLock();
        ReentrantLock reentrantLock = new ReentrantLock();
        Thread thread1 = new Thread(()->sharedResouceReentrantLock.produce(reentrantLock));
        Thread thread2 = new Thread(()->new SharedResouceReentrantLock().produce(reentrantLock));
        thread1.start();
        thread2.start();
    }
}
class SharedResouceReentrantLock{
    public synchronized void produce(ReentrantLock lock){
            lock.lock();
        try {
            System.out.println("Lock Aquired "+Thread.currentThread().getName());
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Lock Released "+Thread.currentThread().getName());
        lock.unlock();
    }
}
