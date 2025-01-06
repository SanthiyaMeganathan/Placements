import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");


        int num = input.nextInt();
        
        input.close();
        int count = 0;


        float sqr = (float) Math.sqrt(num);

        int sqr_value = (int) sqr;


        for (int i = 1; i <= sqr_value; i++) {
            if (num % i == 0) {
                count=+1;
                System.out.println(count);
            }
            if (num % i == 0 &&i != num / i) {
                count++;
            }

        }

        System.out.println(count);

        if (count == 2) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }


    }
    
}
