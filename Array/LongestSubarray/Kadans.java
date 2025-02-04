
import java.util.Scanner;

public class Kadans {

    public static void main(String[] args) {


        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter the number of elements of array");

        int n = input.nextInt();


        kadans(n);


    }


    static void kadans(int n) {

        int[] arr = new int[n];

         Scanner input = new Scanner(System.in);

         for (int i = 0; i < n; i++) {
             arr[i] = input.nextInt();
         }
        
        
         int sum = 0;
         int max = Integer.MIN_VALUE;
         
         int start = 0;
         int end = 0;
         int temp_start = 0;


         for (int i = 0; i < n; i++) {
             sum = sum + arr[i];

             if (sum > max) {
                 max = sum;
                 start = temp_start;
                 end = i;
             }

             if (sum < 0) {
                 sum = 0;
                 temp_start = i + 1;
             }

             if (max < 0) {
                 max = 0;
                 start = -1;
                 end = -1;
             }
         }

         if (start != -1 && end != -1) {

             System.out.println("The starting and ending is  " + start+"," + end);

             System.err.println("The array is :   ");

             for(int i = start ; i<= end ; i++){
                System.out.println(arr[i]);
         }
            
     } else {
            
          System.out.println("The array has max sum of zero");
            
         }

    }
}