import java.util.Scanner;

public class Productof1ton_recursion {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(product(n));
	}
	static int product(int n) {
		if(n==1){
			return 1;
		}
		return n*product(n-1);
	}
}
