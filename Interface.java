public class Interface extends B {
    public static void main(String[] args) {
        B a = new Interface();
        a.display();
        a.d();

        A b = new A() {
            public void display() {
                System.out.println("AA");
            }
        };
        b.display();
    }
}

interface A {
    void display();
    default void d() {
        System.out.println("Shivam");
    }
}

class B implements A, C, D {
    @Override
    public void display() {
        System.out.println("Ayush");
    }
}

interface C {

}

interface D {

}