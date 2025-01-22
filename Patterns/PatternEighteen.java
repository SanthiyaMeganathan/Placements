import java.util.Scanner;

public class PatternEighteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = input.nextInt();
        printpattern(n);

    }
    
    static void printpattern(int n) {

        for (int i = 0; i < n; i++) {
            
            for (int j = 1; j <= +n - i - 1; j++) {
                System.out.print(" ");

            }

           
            int breakpoint = (((2 * i+1)) / 2);
             char ch = 'A';

             for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) {
                    
                    ch++;
                }
                else 
                    ch--;
                    
                
                
            }
            
            for (int j = 1; j <= +n - i - 1; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
         

    }
    

    
}
