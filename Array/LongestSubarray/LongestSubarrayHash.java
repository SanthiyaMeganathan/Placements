import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayHash {

    public static void main(String[] args) {

        System.out.print("Enter the number of element");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter the desire sum of consecutive array");
        int d = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");


        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        HashMap<Integer, Integer> prefixsum = new HashMap<>();

        int sum = 0;
        int maxlength = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == d) {
                maxlength = i + 1;
            }

            int rem = sum - d;
            if (prefixsum.containsKey(rem)) {
                maxlength = Math.max(maxlength, i - prefixsum.get(rem));
            }

            if (!prefixsum.containsKey(rem)) {
                prefixsum.put(sum, i);
            }

        }
        
        System.out.println("the max length :" + maxlength);

        
      
        

        

    }
    
    

    
}
