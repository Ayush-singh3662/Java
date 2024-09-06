public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child(10);
    }
}

class Parent {
    Parent() {
        System.out.println("Non param Parent");
    }
    // Parent(int x) {
    //     System.out.println("Param Parent");
    // }
    Parent(int y) {
        System.out.println("Param Parent "+y);
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Non Param Child");
    }
    Child(int y) {
        super(y);
        System.out.println("Param Child");
    }
    Child(int x, int y) {
        super(x);
        System.out.println(x+" Param Child "+y);
    }
}