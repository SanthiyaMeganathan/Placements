//Bruteforce approach

import java.util.Arrays;
import java.util.Scanner;



public class LargestnuminArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");    
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Largest number in the array is: " + arr[n-1]);

    }
    
}
