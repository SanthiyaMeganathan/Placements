import java.util.Scanner;

public class LongestSubArrayBrute {
    public static void main(String[] args) {


        System.out.println("Enter the size of the array");

        Scanner input = new Scanner(System.in);


        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");


        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the sum you want from the longest subarray of the given array");

        int d = input.nextInt();

        
        int length = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; j++) {
                    sum += arr[k];
                }
                if (sum == d) {
                        length = Math.max(length, j - i + 1);
                    }
            }
        }


        System.out.println("Largest subarray length is :  " + length);
     

        
    

    }
    
}
