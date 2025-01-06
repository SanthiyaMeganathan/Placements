import java.util.ArrayList;
import java.util.Scanner;

public class MoveZeroToLastBrute {

    public static void main(String[] args) {
        System.out.println("Enter the Size of the Array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the elements of array");

        for (int i = 0; i < n; i++) {
            arr.add(input.nextInt());
        }

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (arr.get(i) != 0) {
                temp.add(arr.get(i));
            }
        }
        
        int length = temp.size();

        for (int i = 0; i < length; i++) {
            arr.set(i, temp.get(i));
        }

        for (int i = length; i < n; i++) {
            arr.set(i, 0);
        }
            
        System.out.print("The array after moving all zeros to the end");

        for (int i = 0; i < n; i++) {
            System.out.println(arr.get(i) + " ");
        }
        input.close();

    
        }
    
}
