import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {

        System.out.println("enter the velue of n:  ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printsqare(n);

    }
    
    static void printsqare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n-1) {
                    System.out.print("*");

                } else {
                     System.out.print(" ");
                    
                }

            }
             System.out.println();
        }
    }
    
}
