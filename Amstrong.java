import java.util.Scanner;

public class Amstrong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int num1 = 0;
        int num2 = 0;
        int gotNum = num;

        input.close();
        
        while (num > 0) {
            num1 = num % 10;
            System.out.println(num1);
            num = num /10;
            System.out.println(num);
            num2 += (num1 * num1 * num1);
            System.out.println(num2);
            
        }
        System.out.println("num: " + num);
        System.out.println("num2: " + num2);
        if (gotNum == num2) {
            System.out.println("This is Amstrong Number");
        } else {
            System.out.println("This is not Amstrong Number");
        }


    
    }
    
}
