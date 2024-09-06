public class Synchronization {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
    }
}


//Shared Resource
class MyData {
    // void display(String s) {


    /*  Synchronized block -----------> */


    //     synchronized(this) {  //in place of this we can use any other object through which we want to create synchronization.
    //         for(int i=0; i<s.length(); ++i) {
    //             System.out.println(s.charAt(i));
    //         }
    //     }
    // }

    /* Synchronized method */
    synchronized void display(String s) {
        for(int i=0; i<s.length(); ++i) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}

class MyThread1 extends Thread {
    MyData d;
    MyThread1(MyData data) {
        this.d = data;
    }
    public void run() {
        d.display("Hello World");
    }
}

class MyThread2 extends Thread {
    MyData d;
    MyThread2(MyData data) {
        this.d = data;
    }
    public void run() {
        d.display("Java");
    }
}