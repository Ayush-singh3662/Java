public class Prime_Recursion{
    public static void main(String[] args) {
        int n = 7;
        prime(n, (int)Math.sqrt(n));
    }
	static void prime(int n, int x) {
        if(x==2) {
            System.out.println("Prime");
            return ;
        }
        if(n%x == 0) {
            System.out.println("Not Prime");
            return ;
        }
        prime(n, x-1);
    }
}