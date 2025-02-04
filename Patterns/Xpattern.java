import java.util.Scanner;

public class Xpattern {


    public static void main(String[] args) {

        System.out.print("enter the value of n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char ch = 'A';
        char ch2 = (char) ('A' + n - 1);

        int k = 0;
        int l = 1;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                while (i - l < n) {
                    System.out.print(ch);
                    ch++;
                    l++;
                }

                while(j)
                
            }
        }


        

        
       

    }
    
}
