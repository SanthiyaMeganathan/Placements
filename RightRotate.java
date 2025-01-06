import java.util.Scanner;

public class RightRotate {

    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        
        System.out.println("Enter the number of elements that you wanted to right roate by");
        int d = input.nextInt();
         d = d % n;

        int[] temp = new int[n];

        int j=0;

        for (int i = n - d; i <= n - 1; i++) {
            temp[j] = arr[i];
            j++;
        }

        
            
        for (int i = 0; i <= n-d-1 ; i++) {
            temp[j] = arr[i];
            j++;
        }

        System.out.println("The right rotated array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
    
}
