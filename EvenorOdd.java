
import java.util.Scanner;

public class EvenorOdd {
public static void main(String[] args) {
    
    int number;

    int reminder;

    System.out.println("Enter the NUmber ");

    Scanner in = new Scanner(System.in);

    number = in.nextInt();
    
    reminder=number%2;

    if(reminder==0)
    {
        System.out.println("this is even number");
    }
    else
    {
        System.out.println("This is odd number");
    }
    
}
    
}
