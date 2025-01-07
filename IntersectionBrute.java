import java.util.Scanner;


public class IntersectionBrute {
    public static void main(String[] args) {
        System.out.println("Enter the size of array 1");

        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();

        System.out.println("Enter the Size of array 2");

        int n2 = input.nextInt();

        int[] arr1 = new int[n1];

        int[] arr2 = new int[n2];

        System.out.println("Enter the elements  of array 1");

        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the elements  of array 2");

        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        int n3;

        if (n1 > n2) {
            n3 = n2;
            
        } else {
            n3 = n1;
        }
        
        int[] arr_value = new int[n3];

        for (int i = 0; i < n3; i++) {
            arr_value[i] = 0;
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j] && arr_value[j] == 0) {
                    System.out.print(arr1[i] + " ");
                    arr_value[j] = 1;
                    break;
                }
                if (arr1[i] < arr2[j]) {
                    break;
                }
            }
        }
    }
    
}
