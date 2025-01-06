import java.util.Scanner;


public class MoveZeroToLastOptimal {

    public static void main(String[] args) {
        
        System.out.println("Enter the size of the array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements inside the array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int j = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                arr[i] = arr[j];
                j++;
            }

        }
        
        System.out.println("The array after moving all the zeros to end");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }
    
}
