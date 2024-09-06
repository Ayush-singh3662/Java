import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tcs1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array of box weights
        String[] inputWeights = scanner.nextLine().split(" ");
        int[] weights = Arrays.stream(inputWeights).mapToInt(Integer::parseInt).toArray();

        // Input N and K
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Calculate and print the result
        // int result = calculateMoneyForWorkers(weights, N, K);
        // System.out.println(result);

        // scanner.close();
        int unshifted = 1, prev = 0, j = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (unshifted < K) {
            for (int i = 0; i < (N - 1) * j; ++i) {
                // if (weights[0] < weights[1]) {
                //     int temp = weights[0];
                //     weights[0] = weights[1];
                //     weights[1] = temp;
                // }
                // list.add(weights[1]);
                // rotateArray(weights, 1);
                    // if(wei)
            }
            ++j;
            if (prev == weights[0]) {
                ++unshifted;
            } else {
                unshifted = 1;
            }
            if (unshifted == K) {
                break;
            }
            prev = weights[0];
        }
        System.out.println(calculateCycleCost(list));
    }

    // private static int calculateMoneyForWorkers(int[] weights, int N, int K) {
    //     int totalMoney = 0;

    //     // Process cycles
    //     int consecutiveUnshiftedCycles = 0;
    //     while (consecutiveUnshiftedCycles < K) {
    //         int[] selectedBoxes = Arrays.copyOfRange(weights, 0, N);
    //         Arrays.sort(selectedBoxes);

    //         int lowestWeightBox = selectedBoxes[0];
    //         int secondLowestWeightBox = selectedBoxes[1];

    //         if (lowestWeightBox != secondLowestWeightBox) {
    //             // Move the box with lower weight to the end of the line
    //             int indexOfLowest = indexOf(weights, lowestWeightBox);
    //             int indexOfSecondLowest = indexOf(weights, secondLowestWeightBox);

    //             weights[indexOfLowest] = secondLowestWeightBox;
    //             weights[indexOfSecondLowest] = lowestWeightBox;
    //         } else {
    //             consecutiveUnshiftedCycles++;
    //         }

    //         // totalMoney += calculateCycleCost(weights, N);

    //         // Rotate the array to simulate shifting
    //         // rotateArray(weights, N);
    //     }

    //     return totalMoney;
    // }

    // private static int indexOf(int[] arr, int value) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == value) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    private static int calculateCycleCost(ArrayList<Integer> list) {
        int cycleCost = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!isTriangularNumber(list.get(i))) {
                cycleCost += list.get(i);
            }
        }
        return cycleCost;
    }

    private static boolean isTriangularNumber(int num) {
        // int n = 1;
        // int triangularNumber = 1;

        // while (triangularNumber < num) {
        //     n++;
        //     triangularNumber = n * (n + 1) / 2;
        // }

        // return triangularNumber == num;

        double m = (Math.sqrt(8 * num + 1) - 1) / 2;
        if(Math.floor(m) == m) {
            return true;
        }
        return false;
    }

    private static void rotateArray(int[] arr, int s) {
        int temp = arr[s];
        int n = arr.length;
        for (int i = s; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }
}
