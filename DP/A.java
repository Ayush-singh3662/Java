public class A {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(sum(n));
        System.out.println(count(n));
    }

    private static int sum(int n) {
        if(n <= 0) {
            return 0;
        }
        return n + sum(n-1);
    }

    private static int count(int n) {
        if(n <= 0) {
            return 0;
        }
        return 1 + count(n-1);
    }
}