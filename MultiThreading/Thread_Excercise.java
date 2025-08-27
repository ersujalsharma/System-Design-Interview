package MultiThreading;

public class Thread_Excercise {
    public static void main(String[] args) {
        SharedResouce sharedResouce = new SharedResouce();
        ProducerTask thread1 = new ProducerTask(sharedResouce);
        Thread thread2 = new Thread(new ConsumerTask(sharedResouce));

        thread1.start();
        thread2.start();
    }
}

class SharedResouce{
    boolean isAvailable;

    public synchronized void addItem(){
        System.out.println("Adding Item... by "+Thread.currentThread().getName());
        isAvailable = true;
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consuming Item.... by "+Thread.currentThread().getName());
        if(!isAvailable){
            try{
                System.out.println("Waiting.... by "+Thread.currentThread().getName());
                wait();
            }
            catch(Exception e){

            }
        }
        System.out.println("Consumed Item.... by "+Thread.currentThread().getName());
        isAvailable = false;
    }
}

class ProducerTask extends Thread{
    SharedResouce sharedResouce;
    
    public ProducerTask(SharedResouce sharedResouce){
        this.sharedResouce = sharedResouce;
    }
    
    @Override
    public void run() {
        System.out.println("Producer Task called.....");
        // sleep this thread for 5 second and add the item.
        try{
            Thread.sleep(5000l);
            // don't release any monitor lock
        }
        catch(Exception e){

        }
        sharedResouce.addItem();
    }
}


class ConsumerTask implements Runnable{
    SharedResouce sharedResouce;

    ConsumerTask(SharedResouce sharedResouce){
        this.sharedResouce = sharedResouce;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Consumer Task called.....");
        // consume the item ... if thread is locked then wait to consume..
        sharedResouce.consumeItem();
    }
}