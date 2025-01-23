import java.util.Scanner;

public class Xpattern {


    public static void main(String[] args) {

        System.out.println("Enter the number of rows : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char ch1 = 'A';
        // int lastletter = n - 1;
        // System.out.print(lastletter);
         char ch2 = 'A' + 4;
        // System.out.print(ch2);
        int k =1;

        for (int i = 0; i < (n / 2) + 1; i++) {

            for (char j = 0; j < n; j++) {

                if (i <= (n / 2) + 1) {
                    if (j == i) {
                        System.out.print(ch1);
                        ch1++;

                    }

                    if (j == n - k - 1 && k <= 2) {
                        System.out.print(ch2);
                        ch2--;
                        k++;

                    }

                    else {
                        System.out.print(" *");
                    }

                }

                else {

                }

            }
            System.out.println();
        }
        
        int a = 5;
        int b = 2;
        int c = a / b;
        System.out.println(c);


        
       

    }
    
}
