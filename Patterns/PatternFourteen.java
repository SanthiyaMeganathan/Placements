import java.util.Scanner;

public class PatternFourteen {

    public static void main(String[] args) {

        System.out.print("Enter the value of n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern(n);

    }
    
    static void pattern(int n) {
        int k = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;

            }
            System.out.println();
            ;
        }

    }
    
    /*
    Enter the value of n: 7
1 
2 3
4 5 6
7 8 9 10 
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28 */    
}
