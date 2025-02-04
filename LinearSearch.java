import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = input.nextInt();

        System.out.println("Enter the elements in array");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }

        System.out.println("Enter the target you wnat to  find");

        int t = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == t) {
                System.out.print("The targert  " + t + "   present");
                return;

            }

        }

        System.out.println("The target" + t + "present");

        input.close();
    }
    

    
}
