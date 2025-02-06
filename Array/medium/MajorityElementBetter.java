import java.util.HashMap;
import java.util.Scanner;


public class MajorityElementBetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        FindMajority(n);

    }
    
    static void FindMajority(int n) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : map.keySet()) {
            if ((map.get(num)) > n / 2) {
                System.out.println("The majority element is: " + num);
            }
            
        }

        
    }
    

    
}
