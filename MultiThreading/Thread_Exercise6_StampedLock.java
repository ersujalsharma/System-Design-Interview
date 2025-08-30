package MultiThreading;

import java.util.concurrent.locks.StampedLock;

public class Thread_Exercise6_StampedLock {
    public static void main(String[] args) {
        SharedResouceStampedLock sharedResouceStampedLock = new SharedResouceStampedLock();
        Thread thread1 = new Thread(()->sharedResouceStampedLock.produce());
        Thread thread2 = new Thread(()->sharedResouceStampedLock.consumeItem());
        thread1.start();
        thread2.start();
    }
}

class SharedResouceStampedLock{
    boolean isAvailable = false;
    StampedLock stampedLock = new StampedLock();
    public void produce(){
        long stamp = stampedLock.readLock();
        System.out.println("Producer Aquired Lock" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isAvailable = true;
        stampedLock.unlockRead(stamp);
        System.out.println("Producer Released Lock" + Thread.currentThread().getName());
    }
    public void consumeItem(){
        long stamp = stampedLock.writeLock();
        System.out.println("Consumer Aquired Lock" + Thread.currentThread().getName());
        isAvailable = false;
        stampedLock.unlockWrite(stamp);
        System.out.println("Consumer Released Lock" + Thread.currentThread().getName());
    }
}