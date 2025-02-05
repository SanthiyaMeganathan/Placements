import java.util.HashMap;
import java.util.Scanner;

public class TwoSumbetter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  number of elements in array: ");
        int n = input.nextInt();
        System.out.println("enter the total amount amount you have to buy two chocolates");
        int twosum = input.nextInt();

        FindTwoSum(n,twosum);

    }

    static void FindTwoSum(int n, int twosum) {

        System.out.println("Enter the elements in array");
        Scanner input = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int onechocolate = 0; onechocolate < n; onechocolate++) {
            int another_chocolate = twosum - arr[onechocolate];

            if (map.containsKey(another_chocolate)) {
                System.out.println("The chocolate present in the index" +" "+ map.get(another_chocolate) + " "
                        + onechocolate + "  " + "is the index");

                System.out.println("two chocolate price are"+ arr[map.get(another_chocolate)]+" "+ arr[onechocolate]);
                return;
            }

            if (!map.containsKey(another_chocolate)) {
                map.put(arr[onechocolate], onechocolate);
            }
        }
        
        System.out.println("not able to find the pair of two chocolate whose sum is two sum ");
        System.err.println("[-1, -1]");
        return;
       


    }
    
}
