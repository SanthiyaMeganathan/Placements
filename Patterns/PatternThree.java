import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: n ");

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }



    
}