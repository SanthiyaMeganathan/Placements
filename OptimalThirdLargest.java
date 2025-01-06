import java.util.Scanner;

public class OptimalThirdLargest {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the arrays");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] != max1 && arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];

            } else if (arr[i] > max3 && (arr[i] != max1 && arr[i] != max2)) {
                max3 = arr[i];
            }
        }
        
        System.out.println("The max1 is : " + max1);
        
        System.out.println("The max2 is : " + max2);
        
        System.out.println("The max3 is : " + max3);

    }
    
}
