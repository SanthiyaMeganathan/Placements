
import java.util.Scanner;

public class Kadans {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = input.nextInt();
        FindMaxSubarray(n);

    }
    
    static void FindMaxSubarray(int n) {
        int[] arr = new int[n];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the elemest of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if (sum > 0) {
                maxSum = Math.max(maxSum, sum);
            }

            if (sum < 0) {
                sum = 0;
            }

        }

        if (sum > 0) {

            System.out.println("The max sum of subarry in array :" + sum);
            
        }

        

        if (sum <= 0) {
            System.out.println("The max sum of the subarray in array: "+sum);
        }

        

    }
    
    
}
