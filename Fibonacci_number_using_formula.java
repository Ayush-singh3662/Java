public class Fibonacci_number_using_formula{
    public static void main(String[] args){
        System.out.println(fib(50));
    }

    static int fib(int n){
        return (int) (Math.pow((1+Math.sqrt(5)/2),n)-Math.pow((1-Math.sqrt(5)/2),n)/Math.sqrt(5));
    }
}