import java.util.Scanner;
public class GcdofNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = input.nextInt();
        System.out.println("Enter the secound number");
        int n2 = input.nextInt();
        int gcd = 0;
        input.close();

        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;

            } else {
                n2 = n2 % n1;

            }
        }
        if (n1 == 0) {
            gcd = n2;
        } else {
            gcd = n1;
        }

        System.out.println("The GCD IS : " + gcd);

        //Time Complexity: O(log pi min(n1,n2))
    }   
}
