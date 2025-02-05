import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSumKBtter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = input.nextInt();
        System.out.println("enter the target sum in given array");
        int target = input.nextInt();
        findlength(n, target);

    }
    
    static void findlength(int n, int target) {

        int sum = 0;

        int length =0;

        System.out.println("Enter the elements of array");

        Scanner input = new Scanner(System.in);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int reminder ;

        for (int i = 0; i < n; i++) {

            sum = sum + arr[i];

            if (sum == target) {
                length = i + 1;

            }

            reminder = sum - target;

            if (map.containsKey(reminder)) {
                length = Math.max(length, i - map.get(reminder));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);

            }

        }
        
        System.out.println("The length is  " + length);
        
    }
    
}
