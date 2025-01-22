import java.util.Scanner;

public class Matrixpattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern(n);

    }

    static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i <= n - 1 || j == 0 || j <= n - 1) {
                    System.out.print("4");
                } else if (i == 1 || j == 1 || i == n - 2 || j == n - 2) {
                    System.out.print("3");
                } else if (i == 2 || j == 2 || i == n - 3 || j == n - 3) {
                    System.out.print("2");
                } else if (i == 3 || j == 3 || i == n - 4 || j == n - 4) {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }
}
