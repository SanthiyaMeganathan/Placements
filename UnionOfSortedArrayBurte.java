import java.util.HashSet;
import java.util.Scanner;

public class UnionOfSortedArrayBurte {
    

    public static void main(String[] args) {
        

        System.out.println("Enter the size of 2 arrays");

        Scanner input = new Scanner(System.in);
        
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Enter the Elemts of array 1");

        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();

        }
        System.out.println("Enter the elements of array 2");

        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < n2; i++) {
            set.add(arr2[i]);
        }

        System.out.println("Printing the elements in set");

        

        for (int i : set) {
            System.out.print(i + " ");
        }



        

        int length = set.size();

        

        int[] union = new int[length];

        int index = 0;

        for (int num : set) {
            union[index] = num;
            index++;
            System.out.print(num + " "); // Print the elements directly
        }
        
        System.out.println("the union of two arrays");

        for (int i = 0; i < length; i++) {
            System.out.println(union[i]);
        }
    }
}
