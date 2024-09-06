public class Recursion{
    public static void main(String[] args){
        // program to print 1 to 5 using recursion
        print(1);
    }
    static void print(int n){
        System.out.print(n+" ");
        if(n==5){
            return;
        }
        print(n+1);
    }
}