import java.util.Scanner;




public class BinarySearchSquareRoot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to find the Square root");
        int number = input.nextInt();
        int sqareroot = 0;

        int  low = 1;
        int high = number;

        while (low < high) {
            int mid = (low + high) / 2;
            if (mid * mid <= number) {
                sqareroot = mid;
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        
        double Round_of = Math.floor(sqareroot);

        
        System.out.println("The Squareroot of " + number + "is " + Round_of);
     
        

        
    }
    
}
