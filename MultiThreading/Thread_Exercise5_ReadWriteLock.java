package MultiThreading;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Thread_Exercise5_ReadWriteLock {
    public static void main(String[] args) {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Thread thread1 = new Thread(()-> new SharedResouceReadWriteLock().produce(readWriteLock));
        Thread thread2 = new Thread(()-> new SharedResouceReadWriteLock().produce(readWriteLock));
        Thread thread3 = new Thread(()-> new SharedResouceReadWriteLock().consume(readWriteLock));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class SharedResouceReadWriteLock{
    public void produce(ReadWriteLock readWriteLock){
        readWriteLock.readLock().lock();
        try {
            System.out.println("Shared Lock Aquired - Producer " + Thread.currentThread().getName());
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Shared Lock Released - Producer " + Thread.currentThread().getName());
        readWriteLock.readLock().unlock();
    }
    public void consume(ReadWriteLock readWriteLock){
        readWriteLock.writeLock().lock();
        try {
            System.out.println("Write Lock Aquired - Consumer " + Thread.currentThread().getName());
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Write Lock Released - Consumer " + Thread.currentThread().getName());
        readWriteLock.writeLock().unlock();
    }
}
