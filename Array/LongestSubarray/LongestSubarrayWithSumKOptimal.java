import java.util.Scanner;

public class LongestSubarrayWithSumKOptimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in array");

        int n = input.nextInt();

        System.out.println("Enter the target");

        int target = input.nextInt();

        print(n, target);

    }
    
    static void print(int n, int target) {


        System.out.println("Enter the elements of the array");
        Scanner input = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        //max len:

        int left = 0;
        int maxlength = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            if (sum == target) {
                maxlength = Math.max(maxlength, right - left + 1);
            }

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

        }
        
        System.out.println("The largest subarray is:  " + maxlength);

    }
}
