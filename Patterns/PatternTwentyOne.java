import java.util.Scanner;

public class PatternTwentyOne {

    public static void main(String[] args) {

        System.out.println("enter the number of rows:");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        patternup(n);
        patterndown(n);

    }
    
    static void patternup(int n) {

        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= (n * 2) - (i * 2); j++) {
               
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
    
    static void patterndown(int n) {

        for (int i = 1; i <= n - 1; i++) {
            //star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            //star
             for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            

            System.out.println();
        }
        
    }
    
}
