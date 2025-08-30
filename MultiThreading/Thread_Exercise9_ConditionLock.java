package MultiThreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Thread_Exercise9_ConditionLock {
     public static void main(String[] args) {
        SharedResouceReentrantLockCondition sharedResouceReentrantLock = new SharedResouceReentrantLockCondition();
        
        Thread thread1 = new Thread(()->{for(int i=0;i<2;i++){
            sharedResouceReentrantLock.produce();
        }});
        Thread thread2 = new Thread(()->{for(int i=0;i<2;i++){
            sharedResouceReentrantLock.consume();
        }});
        thread1.start();
        thread2.start();
    }
}
class SharedResouceReentrantLockCondition{
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    boolean isAvailable = false;
    public void produce(){
        try{
            lock.lock();
            System.out.println("Produce Lock aquired by "+Thread.currentThread().getName());
            if(isAvailable){
                System.out.println("Already Available wait to consume...");
                condition.await();
            }
            isAvailable = true;
            condition.signal();
        }
        catch(Exception e){

        }
        finally{
            lock.unlock();
            System.out.println("Produce lock release by :"+ Thread.currentThread().getName());
        }
    }
    public void consume(){
        try {
            Thread.sleep(1000);
            lock.lock();
            System.out.println("Consume lock acquired by "+Thread.currentThread().getName());
            if(!isAvailable){
                System.out.println("Wait for item...");
                condition.await();
            }
            isAvailable = false;
            condition.signal();
        }
        catch(Exception e){

        }
        finally{
            lock.unlock();
            System.out.println("Consume lock release by :"+ Thread.currentThread().getName());
        }
    }
}
