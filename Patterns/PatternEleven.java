import java.util.Scanner;

public class PatternEleven{
    public static void main(String[] args) {
        System.out.println("Enter the value n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern(n);

    }
    
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        
        for (int i = 1; i <= n - 1; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
       
        /**
         * Enter the value n: 
5
*
**
***
****
*****
****
***
**
*
         */
    }
    

}