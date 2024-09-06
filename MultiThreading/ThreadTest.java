/* 1 -> Using Thread Class */

// public class ThreadTest extends Thread {
//     public static void main(String[] args) {
//         ThreadTest t = new ThreadTest();
//         t.start();
//         int i=1;
//         while(true) {
//             System.out.println(i+" World");
//             i++;
//         }
//     }

//     public void run() {
//         int i = 1;
//         while(true) {
//             System.out.println(i+" Hello");
//             i++;
//         }
//     }
// }

// class My extends Thread {
//     public void run() {
//         int i = 1;
//         while(true) {
//             System.out.println(i+" Hello");
//             i++;
//         }
//     }
// }


/* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

/* 2 -> Using Runnable Interface */

public class ThreadTest implements Runnable {
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadTest m = new ThreadTest();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while(true) {
            System.out.println(i+" World");
            i++;
        }
    }
}