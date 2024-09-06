// import java.util.*;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//         String[] str = input.split(" ");
//         int[] arr = new int[str.length];
//         for(int i=0; i<str.length; ++i) {
//             arr[i] = Integer.parseInt(str[i]);
//         }
//         Arrays.sort(arr);
//         int lcm = lcm(arr, 1);
//         System.out.println(lcm);
//         int gcd = gcd(lcm, arr[0]);
//         System.out.println(gcd);
//         if(lcm>1e10){
//             System.out.print("None");
//             return;
//         }
//         if(gcd > 1) {
//             System.out.print("None");
//             return ;
//         }

//         for(long i=lcm; i<=1e10; i+=lcm) {
//             long res = i + arr[0];
//             if(res >= 1e10) {
//                 System.out.print("None");
//                 return ;
//             }
//             if(isPrime(res)) {
//                 System.out.print(res);
//                 return ;
//             }
//         }
//         System.out.print("None");
//     }

//     static int gcd(int a, int b) {
//         return b == 0 ? a : gcd(b, a%b);
//     }

//     static int lcm(int[] arr, int idx) {
//         if(idx == arr.length-1) {
//             return arr[idx];
//         }
//         int a = arr[idx];
//         int b = lcm(arr, ++idx);
//         return ((a*b)/gcd(a, b));
//     }

//     static boolean isPrime(long n) {
//         if(n <= 1) {
//             return false;
//         }
//         for(int i=2; i*i<=n; ++i) {
//             if(n%i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();
        String temp = "";
        for (int i = 0, j = 0; i < s1.length() && j < s1.length();) {
            temp = s1.substring(i, j + 1);
            if (s2.contains(temp)) {
                ++j;
            } else if (i == j) {
                System.out.print("Impossible");
                return;
            } else {
                sb.append(s1.substring(i, j));
                sb.append('|');
                i = j;
            }
        }
        sb.append(temp);
        System.out.print(sb.toString());
        sc.close();
    }
}