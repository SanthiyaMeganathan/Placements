import java.util.Scanner;

public class Array012optimalDutchNationalFlag {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array (only 0, 1, 2 allowed)");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The elements in the array before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to new line

        // Dutch National Flag Algorithm (Three-Pointer Approach)
        int left = 0, mid = 0, right = arr.length - 1;
        int temp;

        while (mid <= right) {  // Use while loop instead of for loop
            if (arr[mid] == 0) { 
                // Swap arr[left] and arr[mid]
                temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                
                left++;
                mid++; // Move mid forward
            } 
            else if (arr[mid] == 1) { 
                mid++; // 1 is in the correct place, move mid forward
            } 
            else { 
                // Swap arr[mid] and arr[right]
                temp = arr[right];
                arr[right] = arr[mid];
                arr[mid] = temp;

                right--; // Move right pointer down
                // **DO NOT** move mid here because the swapped element needs checking
            }
        }

        System.out.println("The array after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to new line

        input.close(); // Close scanner
    }
}
