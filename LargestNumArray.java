import java.util.Scanner;


public class LargestNumArray {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();

        int largest = 0;
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Enter the element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }
        }

        System.out.println("The largest number is : " + largest);
            
    }
    
}
