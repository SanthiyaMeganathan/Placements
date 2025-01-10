import java.util.HashMap;
import java.util.Scanner;


public class BetterNumberAppearOnceHashmap {

    public static void main(String[] args) {
        System.out.println("Enter the size of the number");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int num : map.keySet()) {
            if ((map.get(num)) == 1) {
                System.out.println("Better Number is  appears only once is" + num);
                return;

            }

        }
    }
    
}
