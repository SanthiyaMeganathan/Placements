import java.util.Scanner;


public class Firstandlastdigit {

    public static void main(String[] args) {

     
        Scanner in = new Scanner(System.in);

    System.out.println("Enter the number");
        int number = in.nextInt();
        in.close();

        int lastnumber = number % 10;
        int Firstnumber= number;


        while (Firstnumber > 10) {
            Firstnumber = Firstnumber / 10;
        }

        System.out.println("The First Number is " + Firstnumber);
        System.out.println("The Last Number is " + lastnumber);
        
    }
    
}
