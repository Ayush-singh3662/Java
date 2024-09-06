public class InterProcess {
    public static void main(String[] args) {
        Mydata data = new Mydata();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}

class Mydata {
    int val;
    boolean producer = true;
    synchronized public void set(int x) {
        while(!producer) {
            try {
                wait();
            } catch (Exception e) {
                
            }
        }
        this.val = x;
        producer = false;
        notify();
    }
    synchronized public int get() {
        while(producer) {
            try {
                wait();
            } catch(Exception e) {

            }
        }
        producer = true;
        notify();
        return val;
    }
}

class Producer extends Thread {
    Mydata d;
    Producer(Mydata d) {
        this.d = d;
    }
    public void run() {
        int c = 1;
        while(true) {
            d.set(c);
            System.out.println("Producer " + c);
            c++;
        }
    }
}

class Consumer extends Thread {
    Mydata d;
    Consumer(Mydata d) {
        this.d = d;
    }
    public void run() {
        while(true) {
            int val = d.get();
            System.out.println("Consumer " + val);
        }
    }
}
