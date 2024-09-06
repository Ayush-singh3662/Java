import java.util.Scanner;

public class Pangram_Checker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char[] sentence = new char[1];
        for(int i=0; i<sentence.length; i++){
            sentence[i] = input.next().trim().charAt(0);            
        }
        for(char i='a'; i<='z'; i++){
            if(sentence[i] == i){
                System.out.println("TRUE");
            }
            else{
                System.out.println("FALSE");
            }
        }
    }
}
