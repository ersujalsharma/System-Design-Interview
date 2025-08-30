package MultiThreading;

import java.util.concurrent.locks.StampedLock;

public class Thread_Exercise7_StampedLock_OptimisticRead {
     public static void main(String[] args) {
        SharedResouceStampedLockOptimistic sharedResouceStampedLock = new SharedResouceStampedLockOptimistic();
        Thread thread1 = new Thread(()->sharedResouceStampedLock.produce());
        Thread thread2 = new Thread(()->sharedResouceStampedLock.consumeItem());
        thread1.start();
        thread2.start();
    }
}

class SharedResouceStampedLockOptimistic{
    boolean isAvailable = false;
    StampedLock stampedLock = new StampedLock();
    public void produce(){
        long stamp = stampedLock.tryOptimisticRead();
        try {
            System.out.println("Producer Aquired Lock" + Thread.currentThread().getName());
            // isAvailable = true;
            System.out.println(isAvailable);
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(stampedLock.validate(stamp)){
            System.out.println("Validated");
        }
        else{
            System.out.println("Not Validated");
        }
        System.out.println("Producer Released Lock" + Thread.currentThread().getName());
    }
    public void consumeItem(){
        System.out.println("Consumer Aquired Lock" + Thread.currentThread().getName());
        long stamp = stampedLock.writeLock();
        isAvailable = true;
        stampedLock.unlockWrite(stamp);
        System.out.println("Consumer Released Lock" + Thread.currentThread().getName());
    }
}
