import java.util.Scanner;

public class PatternSixteen {
    public static void main(String[] args) {
        System.out.println("enter the number of letters you want to print: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        letterpattern(n);

    }
    
    static void letterpattern(int n) {

        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A'+(n-i-1) ; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
        
    }
    
}
