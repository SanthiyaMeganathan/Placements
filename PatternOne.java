import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {

        System.out.println("Enter the n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    
}
