import java.util.Scanner;

public class Twosumbrute {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        System.out.println("Enter the sum of two number");
        int twosum = input.nextInt();
        FindTwoSum(n,twosum);

    }
    
    static void FindTwoSum(int n, int twosum) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        //find the two sum;

        for (int firstchocolate = 0; firstchocolate < n; firstchocolate++) {
            int sum = 0;
            for (int secoundchocolate = firstchocolate + 1; secoundchocolate < n; secoundchocolate++) {
                sum = arr[firstchocolate] + arr[secoundchocolate];

                if (sum == twosum) {
                    System.out.println("The two numbers are " + " "+arr[firstchocolate] + " "+arr[secoundchocolate] + " and ")
                    ;
                    System.out.println("The two numbers are " + " "+firstchocolate + " "+secoundchocolate + " and ")
                    ;
                    return;

                }

            }
        }

        System.out.println("we dont found the two sum [-1,-1]");
        
        
        
    }
}
