public class Fibonacci_Series_using_recursion {
    public static void main(String[] args){
        System.out.print(fibonacci(7));
    }
    static int fibonacci(int n){
       if(n<2){
        return n;
       }
       return fibonacci(n-1)+fibonacci(n-2);
    }
}