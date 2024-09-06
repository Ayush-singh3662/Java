public class TestNested {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        new Outer().outerDisplay();
        Outer.Inner io = new Outer().new Inner();
        io.innerDisplay();

        LocalOuter l = new LocalOuter();
        l.local();

        OuterA a = new OuterA();
        a.outerDisplay();

        OuterS s = new OuterS();
        s.outer();
        OuterS.InnerS os = new OuterS.InnerS();
        os.display();
    }
}

//nested inner class
class Outer {
    int x = 10;
    class Inner {
        int y = 20;
        void innerDisplay() {
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
    }
}

//local inner class
class LocalOuter {
    int x = 10;
    void local() {
        int y = 20;
        class LocalInner {
            void display() {
                System.out.println(x);
                System.out.println(y);
            }
        }
        // LocalInner l = new LocalInner();
        // l.display();
        new LocalInner().display();
    }
}


//anonymous inner class
abstract class Ab {
    abstract void display();
}
class OuterA {
    int x = 10;
    void outerDisplay() {
        new Ab() {
            void display() {
                int y= 20;
                System.out.println(x);
                System.out.println(y);
            }
        }.display();
        // a.display();
    }
}

//static inner class
class OuterS {
    static int x = 10;
    int k = 30; //it will not be accessible by static method because it is non static.
    static class InnerS {
        int y = 20;
        void display() {
            System.out.println(x);
            System.out.println(y);
        }
    }

    static void outer() {
        InnerS i = new InnerS();
        i.display();
    }
}