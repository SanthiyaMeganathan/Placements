import java.util.Arrays;
import java.util.Scanner;

public class TwoSumoptimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        System.out.println("Enter the total amount you have to buy 2 chocolates");
        int twosum = input.nextInt();
        FindTwoSum(n, twosum);


    }
    
    static void FindTwoSum(int n, int twosum) {
        
        Scanner input = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        //find two sum using the two pointer;
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int sum = 0;

        System.out.println("the array after sorting");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        while (right > left) {

            sum = arr[right] + arr[left];

            if (sum == twosum) {
                System.out.println("The index of the two sum : " + left + " " + right);

                System.out.println("The elements in the index :" + arr[left] + "  " + arr[right]);

                return;

            }

            if (sum > twosum) {
                right--;
            }
            if (sum < twosum) {
                left++;
            }

        }
        
        System.out.println("No such two elements that adds upto to two was found   [-1,-1]");
        return;
       
        

    }
        
    
    
}
