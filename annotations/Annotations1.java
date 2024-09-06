package annotations;

public class Annotations1 {
    public void display() {
        System.out.println("Ayush");
    }

    @Deprecated
    public void show() {
        System.out.println("Khatam");
    }

    public static void main(String[] args) {
        System.out.println("Main");
    }
}

class Son extends Annotations1 {
    @Override
    public void display() {
        System.out.println("Shivam");
    }
}
