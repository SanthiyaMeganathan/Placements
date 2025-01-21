import java.util.Scanner;


public class PatternTen {

   
    
    static void upper(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
            
        }
       
      


        
        

    }
    
    static void lower(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (((n - i) * 2) - 1); j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        
        System.out.println("Enter the value of n");

        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();

        
        PatternTen obj = new PatternTen();
        obj.upper(n1);
        obj.lower(n1);

    }
}
