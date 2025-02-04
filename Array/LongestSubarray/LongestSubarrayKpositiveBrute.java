import java.util.Scanner;


public class LongestSubarrayKpositiveBrute {
    public static void main(String[] args) {

        System.out.println("enter the number of element in array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of array, every number should be positive:  ");

        for (int i = 0; i < n; i++) {

            arr[i] = input.nextInt();

        }
        
        System.out.println("Enter the sumation of subarray from thearray that you want ");

        int d = input.nextInt();

    

        longestsubarrayofKpositive(arr, n, d);

        


    }
    
    static void longestsubarrayofKpositive(int[] arr, int n, int d) {
        int length = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;
            for (int j = i; j < n; j++) {

                sum = sum + arr[j];
                if (sum == d) {
                    if (j - i + 1 > length) {
                        length = j - i + 1;

                    }

                }
            }

            /*
            
            output:
            enter the number of element in array
8
Enter the elements of array, every number should be positive:  
3
2
1
1
1
2
1
2
Enter the sumation of subarray from thearray that you want 
3
3
             * 
             */
        }
        System.out.println(length);

    }
    

    
}
