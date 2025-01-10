import java.util.Scanner;


public class NumberHash {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] hashharr = new int[max + 1];
        
        for (int i = 0; i < n; i++) {
            hashharr[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {

            System.out.println("The number of times " + arr[i] + "appers in the given array is " + hashharr[arr[i]]);
        }
        

            
        

        




     
        
    }
    
}
