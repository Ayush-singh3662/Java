public class GreatestNumberOfCandies{
    public static void main(String[] args){
        int[] candies = {12, 1, 12};
        int n = candies.length;
        int extracandies = 10;
        int max = 0;
        for(int i=0; i<n; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0; i<n; i++){
            candies[i] += extracandies;
            if(candies[i]>=max){
                System.out.print("True ");
            }
            else{
                System.out.print("False ");
            }
        }
    }
}