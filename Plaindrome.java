import java.util.Scanner;

public class Plaindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = input.nextInt();


      
        int lastdigit = 0;

        int num_taken = num;

        int reversed_num = 0;

        input.close();

        while (num > 0) {
            lastdigit = num % 10;
            num = num / 10;
            reversed_num = reversed_num * 10 + lastdigit;

        }
        if(reversed_num == num_taken){
            System.out.println("The number is a palindrome");
        } else {
        System.out.println("The number is not a palindrome");
    }

        

  

        
      
       

    

        

    }
    
}
