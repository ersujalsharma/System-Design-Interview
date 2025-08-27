package MultiThreading;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 * 
 * Producer can produce items if queue has space, and consumer can consume if queue has element, else they wait.
 * 
 */
public class Producer_Consumer_Problem {
    // for seperate branch
    public static void main(String[] args) {
        SharedResouce1 sharedResouce = new SharedResouce1();
        Thread thread1 = new Thread(new Producer(sharedResouce));
        Thread thread2 = new Thread(new Consumer(sharedResouce));
        thread1.start();
        thread2.start();
    }
}
class SharedResouce1{
    Queue<Integer> q;
    public SharedResouce1(){
        q = new ArrayDeque<>();
    }
    public synchronized void addItem(){
        System.out.println("Adding item");
        if(q.size()==5){
            try {
                System.out.println("Queue is full... wait for availing space.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        q.add(1);
        System.out.println("Added Item....");
        notify();
    }
    public synchronized void consumeItem(){
        System.out.println("Consuming Item...");
        if(q.size()==0){
            try {
                System.out.println("queue is empty... let producer add the items.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        q.poll();
        System.out.println("Consumed Item");
        notify();
    } 
}
class Producer implements Runnable{
    SharedResouce1 sharedResouce;
    public Producer(SharedResouce1 sharedResouce){
        this.sharedResouce = sharedResouce;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(10000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sharedResouce.addItem();
        }
    }
}
class Consumer implements Runnable{
    SharedResouce1 sharedResouce;
    public Consumer(SharedResouce1 sharedResouce){
        this.sharedResouce = sharedResouce;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(5000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sharedResouce.consumeItem();
        }
    }
    
}
