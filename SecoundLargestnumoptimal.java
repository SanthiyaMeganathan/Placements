import java.util.Scanner;


public class SecoundLargestnumoptimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of Array ");

        int n = input.nextInt();

        System.out.println("Enter the elements of Array ");

        int[] arr = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            arr[i] = input.nextInt();
        }

        int largest = 0;
        int secoundLargest = 0;
        

        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > largest) {
                secoundLargest = largest;
                largest = arr[i];
                

            } else if (arr[i] < largest && arr[i] > secoundLargest) {
                secoundLargest = arr[i];
            }

        }
        
        System.out.println("The largest element is: " + largest);
        System.out.println("The second largest element is: " + secoundLargest);

        

        

    }
    
}
