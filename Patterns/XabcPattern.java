import java.util.Scanner;

public class XabcPattern {
    public static void main(String[] args) {

        System.out.print("Enter the number of rows , that should be odd :  ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int k = 0;
        char ch1 = 'A';
        int lastletter = n - 1;

        char ch2 = (char) ('A' + lastletter);
        

        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(ch1);
                    ch1++;
                }
                if (i == k && j == n - k - 1 && i !=j ) {
                    System.out.print(ch2);
                    ch2--;
                    k++;
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        for (int i = 0; i < n / 2+1; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - k - i) {
                    ch1--;
                    System.out.print(ch1);
                }
                if (j == n - i) {
                    System.out.print(ch2);
                    ch2++;
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      
        

    }
    
    
    
}
