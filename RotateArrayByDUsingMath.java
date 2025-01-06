import java.util.Scanner;


public class RotateArrayByDUsingMath {

    public static void main(String[] args) {
        

        System.out.println("Enter the number of elements in Array");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the number that you want to rotate by in Left: ");

        int d = input.nextInt();

        d = d % n;

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];

        }


        System.out.println("The numbers in temp array: ");

        for (int i = 0; i < d; i++) {
            System.out.println(temp[i] + " ");
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        
        System.out.println("The elements in array after putting the elements in back to front");

        for (int i = 0; i < n-d ; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Enter the elements that we stored in temp to array ");

        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];

        }
        
        System.out.println("The Array which is Roated by D elements in Left");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    
}
