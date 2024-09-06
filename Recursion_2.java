import java.util.Scanner;

public class Recursion_2 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		print(n);
		printrev(n);
	}
	//printing from n to 1
	static void printrev(int n) {
		if(n == 0) {
			return ;
		}
		System.out.print(n+" ");
		printrev(n-1);
	}
	//printing from 1 to n
	static void print(int n) {
		if(n==0){
			return ;
		}
		print(n-1);
		System.out.print(n+" ");
	}
}
