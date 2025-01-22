import java.util.Scanner;

public class PatternTwenty {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        
        patternup(n);
        patterndown(n);
    }

    static void patternup(int n) {
        for (int i = 0; i < n; i++) {  // Change i <= n to i < n to fix symmetry
            // Print stars
            for (int j = 1; j <= n - i; j++) {  // Fix condition
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= n - i; j++) {  // Fix condition
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patterndown(int n) {
        for (int i = 1; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= (n * 2) - (i * 2); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
