import java.util.Scanner;

public class PatternTwelve {
    public static void main(String[] args) {

        System.out.println("enter the value of n; ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern(n);

    }
    
    static void pattern(int n) {

        int start;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;

            }
            System.out.println();

        }
    }
    /*
     * java PatternTwelve
enter the value of n; 
8
1
01
101
0101
10101
010101
1010101
01010101
     */
    
}
