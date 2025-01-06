import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> hst = new HashSet<>();

        System.out.println("Enter the elemets of the array");

        for (int i = 0; i < n; i++) {

            arr[i] = input.nextInt();

        }
        
        
        for (int i = 0; i < n; i++) {
            hst.add(arr[i]);
           

        }
        
        System.out.println("The array with out duplicate " + hst);

        int length_hst = hst.size();

        System.out.println("The size of the Array without duplicate " + length_hst);


        
      
    }
    
}
