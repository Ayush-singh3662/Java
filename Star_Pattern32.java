import java.util.Scanner;

public class Star_Pattern32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            for(char j='E'; j>='A'; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
