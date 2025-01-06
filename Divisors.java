import java.util.ArrayList;
import java.util.Scanner;


public class Divisors {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
       
        input.close();
        ArrayList<Integer> divisors = new ArrayList<>();
        float Sqrtnum = (float) Math.sqrt(number);
        
        for (int i = 1; i <= Sqrtnum; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
            if (i != number / i) {
                divisors.add(number / i);
            }

        }
        System.out.println(divisors);
        
    }
}

