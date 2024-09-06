import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Original word: ");
        String word = input.nextLine();
        String revword = "";
        for(int i = 0; i<word.length(); i++){
            revword = word.charAt(i) + revword;
        }
        System.out.print("Reversed word = "+revword);
    }
}
