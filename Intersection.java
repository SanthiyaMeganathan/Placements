import java.util.ArrayList;
import java.util.Scanner;

//Wc:Tc: O(N1+n2)
//sc:O(1) no extra space
//optimal

public class Intersection {
    public static void main(String[] args) {
        System.out.println("Enter the Size of array 1");
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();

        System.out.println("Enter the Size of array 2");
        int n2 = input.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of array 1");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.println("Enter the elements of array 2");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        ArrayList<Integer> intersection = new ArrayList<>();

        int i = 0, j = 0;

        // Traverse both arrays
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                // Add common element
                intersection.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                // Move pointer of the smaller element
                i++;
            } else {
                j++;
            }
        }

        System.out.println("The elements in intersection:");
        for (int num : intersection) {
            System.out.println(num);
        }
    }
}
