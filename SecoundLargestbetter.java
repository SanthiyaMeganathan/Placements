import java.util.Scanner;



public class SecoundLargestbetter {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of numbers in the Array :  ");
        int n = input.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter the element of the Array");

        for (int i = 0; i <= n - 1; i++) {
            arr[i] = input.nextInt();

        }
        input.close();
        
        int largest = 0;
        int secound_largest = 0;

        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > secound_largest && arr[i] < largest) {
                secound_largest = arr[i];
            }
        }

        System.out.println("The secound largest element is: " + secound_largest);
        System.out.println("The largest elemnt of the Array : " + largest);


        
    }

    
}
