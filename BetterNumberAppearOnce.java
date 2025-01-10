import java.util.Scanner;

public class BetterNumberAppearOnce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements  in array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }

        int[] hash_arr = new int[max + 1];
        
        for (int i = 0; i < n; i++) {
            hash_arr[arr[i]]++;
        }
        
        for (int i = 0; i < n; i++) {
            if (hash_arr[arr[i]] == 1) {
                System.out.println("The number that appers only once is "+ arr[i]);
                
            }
        }
    }
    
}
