import java.util.Scanner;

public class Patternnineteen {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern(n);
    }

    static void pattern(int n) {

        

        for (int i = 1; i <= n; i++) {

            for (char j = (char) ('A' + n - i); j <= ('A' + n - 1); j++) {
                System.out.print(j + " ");
            }

            /*
             * Enter the number of rows
6
F 
E F
D E F
C D E F
B C D E F
A B C D E F
             */
System.err.println("");
            
            

            
        }
        
    }
    
}
