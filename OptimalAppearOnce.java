import java.util.Scanner;

public class OptimalAppearOnce {

    public static void main(String[] args) {
        System.out.println("Enter the size of thr array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elments of array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];

        }

        System.out.println("The only number that appears once is"+xor);
    }
    
}
