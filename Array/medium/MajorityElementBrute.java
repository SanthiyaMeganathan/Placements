import java.util.Scanner;


public class MajorityElementBrute {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        FindMajority(n);

    }
    
    static void FindMajority(int n) {
        int[] arr = new int[n];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
         
        //find which num occurs majority of the time

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > n / 2) {
                    System.out.println("The majority element is " + arr[i]);
                    System.out.println("The majorty element occurs for  "+ count + "  times");
                    return;
                }
            }
        }
        
        System.out.println("There is no majority element -1");

        return;
    }
    
}
