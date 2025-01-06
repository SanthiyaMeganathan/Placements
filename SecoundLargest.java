import java.util.Arrays;
import java.util.Scanner;

public class SecoundLargest {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of the Array");
            int n = input.nextInt();

            int[] arr = new int[n];

            int secound = 0;

            for (int i = 0; i <= n - 1; i++) {
                System.out.println("enter the " + i + "element");
                arr[i] = input.nextInt();
            }

            
            Arrays.sort(arr);

            for (int i = 0; i <= n - 1; i++) {
                System.out.println("The element of i is : " + arr[i]);

            }
            int largest = n-1;


            
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] != largest) {
                    secound = arr[i];
                    System.out.println("The secound Largest number in the array: " + secound);
                    break;
                  
                }

            }

            

            

        
           

         

          
            
         
    }

    
}
