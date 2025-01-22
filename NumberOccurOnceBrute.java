import java.util.Scanner;

public class NumberOccurOnceBrute {

    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array  only one element that should reapet once");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int count = 0;
        int num = 0;
        int j ;

        for (int i = 0; i < n; i++) {

            num = arr[i];

            for (j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                } 
            }
             if (count == 1) {
                 System.out.println("The number that appred only once is " + arr[j]);
                 return;
            
            }

        }
        
 

    }
    
}
