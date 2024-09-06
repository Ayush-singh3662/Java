import java.util.Scanner;
public class Palindrome_Checker{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a  word: ");
      String word = input.next();
      if(isPalindrome(word) == true){
         System.out.println("Given word is palindrome");
      }
      else{
         System.out.println("Given word is not palindrome");
      }
   }
   static boolean isPalindrome(String word){
      for(int i=0, j=word.length()-1; i<word.length()/2; i++, j--){
         if(word.charAt(i) != word.charAt(j)){
            return false;
         }
      }
      return true;
   }
}