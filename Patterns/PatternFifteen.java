import java.util.Scanner;

public class PatternFifteen {
    public static void main(String[] args) {

        System.out.println("enter the elements that want to print : number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printletterpattern(n);
    }

    static void printletterpattern(int n) {
        for (int i = 0; i <n; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
         }
    }
    
}
