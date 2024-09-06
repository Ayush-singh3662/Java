import java.util.Scanner;
public class Find_ith_Bit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = input.nextInt();
        System.out.println(findBit(n, i));
    }
    static int findBit(int n, int i){
        return (n>>(i-1)) & 1;
    }
}
