import java.util.Scanner;

public class KadansWithSubarray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = input.nextInt();
        FindSubarrayMaxSum(n);

    }
    
    static void FindSubarrayMaxSum(int n) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements in array");
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int start = 0;
        int end = 0;
        int temp_start = 0;

        int maxprofit = Integer.MIN_VALUE;
        int currentProfit = 0;

        for (int i = 0; i < n; i++) {

            currentProfit += arr[i];

            if (currentProfit>maxprofit ) {
                maxprofit = currentProfit;
                start = temp_start;
                end = i;
            }

            if (currentProfit < 0) {
                temp_start = i + 1;
                currentProfit = 0;
            }

        }
        
        if (maxprofit < 0) {
            System.out.println("The complete array is negative so max streak is emplty array []");
        }
        System.out.println("The max profit is:  " + maxprofit);

        if (maxprofit > 0) {
            System.out.println("The max profit is:  " + maxprofit);

            System.out.println("The consecutive array is:  ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}
