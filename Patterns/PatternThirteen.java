import java.util.Scanner;

public class PatternThirteen {
    public static void main(String[] args) {

        System.out.println("enter the value of n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern(n);

    }
    
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            //num
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //space
            for (int j = 1; j <= (n * 2) - (i * 2); j++) {
                System.out.print(" ");

            }
            //num
            for (int j = i; j > 1; j--) {
                System.out.print(j);

            }
            System.out.println();
        }
        /*
         * java PatternThirteen      
enter the value of n: 
6
1
12        2
123      32
1234    432
12345  5432
12345665432
         */
        
    }
    
}
