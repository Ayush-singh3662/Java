package lambdaExpressions;

@FunctionalInterface
interface My {
    public void show();
    // int add(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        // My m = new My() {
        //     public void show() {
        //         System.out.println("Hello");
        //     }
        // };

        My m = () -> {System.out.println("Hello");};
        m.show();
    }
}
