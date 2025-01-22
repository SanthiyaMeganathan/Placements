import java.util.Scanner;

public class PatternSeventeen {
    
    public static void main(String[] args) {

        System.out.println("Enter the number to print the pattern");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printpatterninletter(n);

    }

    static void printpatterninletter(int n) {
        char letter = 'A';
        for (int i = 0; i < n; i++) {
            
            
            for (char j = 0; j <= i; j++) {
                System.out.print(letter);

            }
            
            System.out.println();
            letter++;
        }
        
    }
}
