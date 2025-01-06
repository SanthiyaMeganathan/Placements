import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to check wheather its a prime number");
        int number = input.nextInt();
        input.close();

        

        ArrayList<Integer> num_arr = new ArrayList<>();

        int sum = 0;

        double sqareroot = (float) Math.sqrt(number);

        for (int i = 1; i <= sqareroot; i++) {
            if (number % i == 0) {
                num_arr.add(i);
            }
            if (i != number / i) {
                num_arr.add(number / i);
            }
        }

        System.out.println(num_arr);

        for (int num : num_arr) {
            sum += num;
        }

        int answer = sum - number;

        if (answer == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }

        

        






    }
    
}
