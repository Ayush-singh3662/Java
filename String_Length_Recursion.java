import java.util.Scanner;

public class String_Length_Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(answer(str, 0));
	}
	static int answer(String str, int count) {
        if(str.isEmpty()) {
            return count;
        }
        return answer(str.substring(1), count = count+1);
    }
}
