import java.util.Scanner;

public class RichestCustomerWealth{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] accounts = new int[3][3];
        int m = accounts.length;
        int n = accounts[0].length;
        int maxwealth = 0;
        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                accounts[i][j] = input.nextInt();
                sum = sum + accounts[i][j];
            }
            if(sum>maxwealth){
                maxwealth = sum;
            }
        }
        System.out.println(maxwealth);
    }
}