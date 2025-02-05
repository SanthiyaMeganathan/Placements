import java.util.Arrays;
import java.util.Scanner;


public class Array012brute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array , the element should be 1, 0, 2");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("The array after sorting");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
