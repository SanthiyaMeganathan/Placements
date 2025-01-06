
import java.util.Scanner;


public class Powerofnum {
    public static void main(String[] args) {
        int base, power;
        float result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        base = sc.nextInt();
        System.out.println("Enter the power");
        power = sc.nextInt();
        result = (float) Math.pow(base, power);
        System.out.println("The result is: " + result);

        int result2 = 1;

        
        
        for (int i = 1; i <= power; i++) {
            result2 = result2 * base;
        }
        
        System.out.println("The result is: " + result2);
    }
    
}
