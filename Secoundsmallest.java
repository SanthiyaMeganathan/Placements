import java.util.Scanner;


public class Secoundsmallest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in array : ");

        int n = input.nextInt();

        System.out.println("Enter the elements of array: ");

        int[] arr = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            arr[i] = input.nextInt();

        }

        int smallest = arr[0]; //11
        int secondSmallest = arr[0]; //12



        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];

            }

        }
        
        System.out.println("The smallest number is :  " + smallest);
        
        System.out.println("The sceound smallest is : "+ secondSmallest);


    }

    
}
