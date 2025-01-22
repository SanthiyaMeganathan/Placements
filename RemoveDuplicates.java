
import java.util.Scanner;

//removing duplicates in sorted array:

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the elements of the array");


        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        
        int i = 0;
 ;

        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
              
            }
        }
        
        System.out.println("The number of elements in array without duplicate " + (i+1) );
    }
    
}
