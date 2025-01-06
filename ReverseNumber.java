import java.util.Scanner;



public class ReverseNumber {

    public static void main(String[] args) {
        

        System.out.println("Enter the number: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        input.close();

        String converttoString = "" + number;

        int length = converttoString.length();

        StringBuilder reversedNumber = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversedNumber.append(converttoString.charAt(i));

        }
        
        System.out.println("The Reversed number: " + reversedNumber);
    }
    
}
