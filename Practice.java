import java.util.*;

public class Practice { 
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("Here, true stands for prime number. Whereas, false stands for non-prime number.");
        // boolean[] primes = sieveOfEratothenes(n);
        // for(int i=0; i<=n; i++) {
        //     System.out.println(i+" = "+primes[i]);
        // }

        // String str = "123-456";
        // String[] arr = str.split("-", 2);
        // System.out.println(Arrays.toString(arr));

        // String[] arr = {"Ayush", " Kumar"};
        // System.out.println(String.join(" ", arr));

        // System.out.println(fib(5));
        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // System.out.println(binary(arr, 0, arr.length-1, 78));

        // System.out.println(sum(5));

        // int num = 123;
        // System.out.println(reverse(num));

        // int num = 100002;
        // System.out.println(count(num));

        // int num = 102;
        // System.out.println((num/10)%10);
        // System.out.println(num);
        
        // int[] arr = {1, 2, 4, 4};
        // // ArrayList<Integer> list = new ArrayList<>();
        // // System.out.println(search2(arr, list, 7, 0));
        // System.out.println(search3(arr, 4, 0));

        // \u000d //System.out.println("@java_quizs");

        // printPattern(4, 4);
        // System.out.println();
        // System.out.println();
        // System.out.println();   
        // System.out.println("Hello World");

        // String str = "";
        // while(str.length() != 2) {
        //     str += "a";
        // }
        // System.out.println(str);

        // System.out.println(null);

        // A c = new C();
        // c.m();

        // String str = "hello*3";
        // System.out.println(count(str));

        // String str1 = "code";
        // String str2 = "duce";
        // System.out.println(anagram(str1, str2));

        // String str = "hcf5byu6hjguygf7kjbhjfuf8";
        // int sum = 0;
        // for(char ch : str.toCharArray()) {
        //     if(Character.isDigit(ch)) {
        //         sum += ch - '0';
        //     }
        // }
        // System.out.println(sum);
        // int x = Integer.parseInt("1");
        // System.out.println(x);
        // System.out.println(Integer.parseInt("1"));

        int a = 5;
        int b = 0;
        try {
            int c = a/b;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Not a problem");
        }
    }

    static boolean[] sieveOfEratothenes(int n) {
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for(int i=2; i*i <= n; i++) {
            for(int j=2*i; j<=n; j+=i) {
                arr[j] = false;
            }
        }
        return arr;
    }

    static int fib(int n) {
        if(n < 2) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    static int binary(int[] arr ,int start, int end ,int target) {
        if(start > end) {
            return -1;
        }
        int mid  = start + (end-start)/2;
        if(arr[mid] == target) {
            return mid;
        }
        else if(arr[mid] < target) {
            return binary(arr, mid+1, end, target);
        }
        return binary(arr, start, mid-1, target);
    }

    static void printRev(int n) {
        if(n == 0) {
            return ;
        }
        System.out.print(n+" ");
        printRev(n-1);
    }

    static void print(int n) {
        if(n == 0) {
            return ;
        }
        print(n-1);
        System.out.print(n+" ");
    }

    static int product(int n) {
        if(n == 1) {
            return n;
        }
        return n*product(n-1);
    }

    static int sum(int n) {
        if(n == 0) {
            return n;
        }
        return n+sum(n-1);
    }

    static int sum = 0;
    static int reverse(int num) {
        if(num == 0) {
            return sum;
        }
        sum = sum * 10 + (num%10);
        return reverse(num/10);
    }

    static int count = 0;
    static int count(int n) {
        if(n == 0) {
            return count;
        }
        count = n%10 == 0 ? count+1 : count;
        return count(n/10);
    }

    static boolean isSorted(int[] arr, int idx) {
        if(idx == arr.length-1) {
            return true;
        }

        if(arr[idx] > arr[idx+1]) {
            return false;
        }

        return isSorted(arr, idx+1);
    }

    static int search(int[] arr, int target, int idx) {
        if(idx == arr.length) {
            return -1;
        }

        if(arr[idx] == target) {
            return idx;
        }
        return search(arr, target, idx+1);
    }

    static ArrayList<Integer> search2(int[] arr, ArrayList<Integer> list, int target, int idx) {
        if(idx == arr.length) {
            return list;
        }

        if(arr[idx] == target) {
            list.add(idx);
        }

        return search2(arr, list, target, idx+1);
    }

    static ArrayList<Integer> search3(int[] arr, int target, int idx) {
        ArrayList<Integer> list1 = new ArrayList<>();
        if(idx == arr.length) {
            return list1;
        }

        if(arr[idx] == target) {
            list1.add(idx);
        }

        ArrayList<Integer> list2 = search3(arr, target, idx+1);
        list1.addAll(list2);
        return list1;
    }

    // static void printPattern(int row, int col) {
    //     if(row == 0) {
    //         return ;
    //     }

    //     if(row > col) {
    //         printPattern(row, col+1);
    //         System.out.print("* ");
    //     }
    //     else {
    //         printPattern(row-1, 0);
    //         System.out.println();
    //     }
    // }

    static void printPattern(int row, int col) {
        if(row == 0) {
            return ;
        }

        if(row > col) {
            printPattern(row, col+1);
            System.out.print("* ");
        }
        else {
            printPattern(row-1, 0);
            System.out.println();
        }
    }

    static String count(String str) {
        String token = "wltg4sej637";
        HashSet<Character> set = new HashSet<>();
        for(char ch : token.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                ch = str.charAt(i) == 'z' ? 'A' : (char)(str.charAt(i)+1);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ch -= 32;
                }
            }
            sb.append(ch);
        }
        StringBuilder res = new StringBuilder();
        for(int i=0; i<sb.length(); i++) {
            if(set.contains(sb.charAt(i))) {
                res.append("--");
                res.append(sb.charAt(i));
                res.append("--");
            }
            else {
                res.append(sb.charAt(i));
            }
        }
        return res.toString();
    }

    
}

class A {
    void m() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    void m() {
        System.out.println("B");
    }
}

class C extends A {
    @Override
    void m() {
        System.out.println("C");
    }
}