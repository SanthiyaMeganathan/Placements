import java.util.Scanner;


public class sortedArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            arr[i] = input.nextInt();

        }

        input.close();

        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] > arr[i - 1]) {

            } else {
                System.out.println("This is not sorted");
                return;
            }
        }
        
        System.out.println("This is sorted array");
      
    }
    
}
