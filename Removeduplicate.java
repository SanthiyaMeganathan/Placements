import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Removeduplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }


        Arrays.sort(arr);
        ArrayList<Integer> arr_withoutDuplicates = new ArrayList<>();
       
        

        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] != arr[i - 1]) {
                arr_withoutDuplicates.add(arr[i]);

            }
        }

        for (int i = 0; i <= n - 1; i++) {
            if(arr[0]!= arr_withoutDuplicates[i].Strea){

            }
        }
          

      
            
        
        System.out.println("Array without duplicates: " + arr_withoutDuplicates);
        

    }
    
}
