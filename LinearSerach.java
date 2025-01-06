import java.util.Scanner;

public class LinearSerach {

    public static void main(String[] args) {
        
        System.out.println("Enter the size of the array");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");

        for (int i = 0; i < n; i++) {

            arr[i] = input.nextInt();

        }
        
        System.out.println("Enter the element you want to find in array");

        int num = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                System.out.println("Element is present at index " + i);
                return;
            }
        }

        System.out.println("Element that you are searching not found in array");

    }
    
}
