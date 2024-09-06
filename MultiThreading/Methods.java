public class Methods {
    public static void main(String[] args) {
        // Thread t = new Thread("Ayush");
        // System.out.println(t.getName());
        MyThread t2 = new MyThread();
        // System.out.println(t2.getName());
        // System.out.println(t2.getPriority());
        // System.out.println(t2.getState());
        // t2.start();
        // // t2.interrupt();
        // System.out.println(t2.getState());
        // // t2.interrupt();
        // System.out.println(t2.isAlive());
        // System.out.println(t2.getClass());
        // t2.setPriority(1);
        // System.out.println(t2.getPriority());
        // System.out.println(t2.isInterrupted());
        // System.out.println(t2.threadId());
        // System.out.println(t2.getStackTrace());
        t2.setDaemon(true);
        t2.start();
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        // System.out.println(t2.getPriority());
        // Thread main = Thread.currentThread();
        // main.yield();
        // main.join();
        // try {
        //     t2.join();
        //     main.interrupt();
        // } catch(Exception e) {}

        // for(int i=1; i>-100; ++i) {
        //     System.out.println(i +" Main");
        //     // Thread.yield();
        // }

        System.out.println("Ayush");
    }
}

class MyThread extends Thread {
    // MyThread(String name) {
    //     super(name);
    //     setPriority(7);
    //     setName("Jaaa");
    // }

    public void run() {
        long c = 1L;
        while(c > -11) {
            System.out.println(c++);
            // Thread.yield();
            // try {
            //     sleep(100);
            // } catch(Exception e) {
            //     System.out.println(e);
            // }

            // interrupt();
        }
    }
}
