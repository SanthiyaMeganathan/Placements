import java.util.Scanner;

public class LongestSubarrayWithSumK {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of tha array");
        int n = input.nextInt();
        System.out.println("Enter the target sum you want to find in array");
        int target = input.nextInt();

        findlengthofSubarray(n, target);
    }
    
    static void findlengthofSubarray(int n, int target) {

        int length = 0;
       
        System.out.println("enter the elements of array");

        Scanner input = new Scanner(System.in);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = input.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {

                sum = sum + arr[j];

                if (sum == target) {
                    length = Math.max(length, j - i + 1);

                }

            }

        }
        
        System.out.println("the length of the subarray is   "+  length);

        
    }
    


}
