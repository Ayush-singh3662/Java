import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        WhiteBoard w = new WhiteBoard();
        Teacher t = new Teacher(w);
        Student s1 = new Student("A", w);
        Student s2 = new Student("B", w);
        Student s3 = new Student("C", w);
        Student s4 = new Student("D", w);
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}

class WhiteBoard {
    String text;
    int number = 0;
    int cnt;

    public void attendance() {
        number++;
    }

    synchronized void write(String text) {
        while(cnt != 0) {
            try {
                wait();
            } catch(Exception e) {}
        }
        this.text = text;
        cnt = number;
        notifyAll(); //in case of notify(), only single thread will read multiple times but we want to read all the students thread that's why we have used notifyAll().
    }
    synchronized String read() {
        while(cnt == 0) {
            try {
                wait();
            } catch(Exception e) {}
        }
        cnt--;
        if(cnt == 0) {
            notify();
        }
        return text;
    }
}

class Teacher extends Thread {
    WhiteBoard w;
    Scanner sc = new Scanner(System.in);
    Teacher(WhiteBoard w) {
        this.w = w;
    }
    public void run() {
        String text;
        do {
            text = sc.nextLine();
            w.write(text);
        } while(!text.equals("end"));
    }
}

class Student extends Thread {
    WhiteBoard w;
    String name;
    Student(String name, WhiteBoard w) {
        this.w = w;
        this.name = name;
    }
    public void run() {
        w.attendance();
        String text;
        do {
            text =  w.read();
            System.out.println(name+" is reading "+text);
        } while(!text.equals("end"));
    }
}
