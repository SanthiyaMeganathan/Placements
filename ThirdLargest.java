import java.util.Scanner;


public class ThirdLargest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }

        System.out.println("The max 1 is : " + max1);
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println("The max2 element is" +max2)
        ;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max3 && (arr[i] != max1 && arr[i] != max2)) {
                max3 = arr[i];
            }
        }

        System.out.println("The max2 element is" +max3);

    }
    
}
