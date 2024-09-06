public class Abstract {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Super s1 = new Super(); //We cannot create object of abstract class
        Super s2; //We can create reference of abstract class.

        Sub s3 = new Sub();
        
        Super s = new Sub();
        s.meth2();
    }
}

abstract class Super {
    Super() {
        System.out.println("Parent Constructor");
    }

    void meth1() {
        System.out.println("Parent meth1");
    }

    abstract void meth2();
}

class Sub extends Super {
    void meth2() {
        System.out.println("Child meth2");
    }
}