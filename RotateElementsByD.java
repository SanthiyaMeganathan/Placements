import java.util.Scanner;


public class RotateElementsByD {

    public static void main(String[] args) {
        

        System.out.println("Enter the number of element in Array");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the arrays");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the number of rotation");

        int d = input.nextInt();

        d = d % n;

        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        
        System.out.println( "The elements in temp array");

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        System.out.println("The elemts after putting in front");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

        int j =0;

        for (int i = n - d; i < n; i++) {
            arr[i] = temp[j];
            j++;

        }

        System.out.println("The Array roatated by d elements is ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

       

    }
    
}
