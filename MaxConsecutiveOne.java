import java.util.Scanner;


public class MaxConsecutiveOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in array");

        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the 0's and 1's in array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }

        }

        System.out.println("Consecutive 1's" + max);


    }
    
}
