import java.util.Scanner;

public class PatternEight {
    public static void main(String[] args) {
        System.out.println("enter the number of rows:  ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((n - i) * 2) - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     * Command:
     *  java PatternEight
enter the number of rows:  
5
*********
 *******
  *****
   ***
    *
     */
    
}
