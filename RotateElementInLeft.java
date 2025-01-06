import java.util.Scanner;


public class RotateElementInLeft {

    public static void main(String[] args) {
        

        System.out.println("Enter the number of element in Array");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the arrays");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The left roated array in place");

        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    
}
