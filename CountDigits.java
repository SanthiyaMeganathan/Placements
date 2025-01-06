import java.util.Scanner;


public class Countdigits{

    public static void main(String[] args) {

        System.out.println("Enter the number");

        Scanner input = new Scanner(System.in)
        ;
        
        int number = input.nextInt();

        System.out.println("Enter the num:");

        int num = input.nextInt();

        String convertStringNumber = "" + num;

        int length = convertStringNumber.length();

        System.out.println("The length is :" + length);

        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        System.out.println("The count of the digit is : " + count);
    }
    
}
