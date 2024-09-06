public class Deadlock {
    public static void main(String[] args) {

//The following code will create a situation of deadlock between the both threads...

        System.out.println("main started");
        String lock1 = "ayush";
        String lock2 = "kumar";
        Thread t1 = new Thread(() -> {
            synchronized(lock1) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                synchronized(lock2) {
                    System.out.println("lock of t1 acquired");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized(lock2) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                synchronized(lock1) {
                    System.out.println("lock of t2 acquired");
                }
            }
        });
        t1.start();
        t2.start();
    }
}