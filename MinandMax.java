import java.util.Scanner;

public class MinandMax {
    public static void main(String[] args) {
      

        System.out.println("Enter the size of the array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the Arrays: ");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The max num inarray :" + max);

        int min = max;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The min number of the array" + min);

        input.close();
    }
    
    
}
