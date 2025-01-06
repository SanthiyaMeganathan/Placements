import java.util.ArrayList;
import java.util.Scanner;



public class GcdAndLcm {

    public static void main(String[] args) {
        System.out.println("Enter the number1 to find the GCD");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        System.out.println("Enter the number2 to finf the Gcd");
        int n2 = input.nextInt();

       

       

        int n;
        if (n1 > n2) {
            n = (int)n1;   
        } else {
            n =(int) n2;
        }

  
        ArrayList<Integer> divisors = new ArrayList<>();

        for(int i =1 ; i<= n; i++){
            if(n1/i==0&&n2/i==0){
                divisors.add(i);
                
            }
       }

       int gcd = 0;
      

       for(int num: divisors){
        if(num>gcd){
            gcd=num;
        }

       }
    //     int lcm =gcd;

    //     for(int num: divisors){
    //     if(num<gcd && num!= 1){
    //         lcm=gcd;
    //     }

    //    }

       System.out.println("The Gcd of the number is : " +gcd);
       
    //    System.out.println("The lcm of the number is : " +lcm);










       

            
        }
    }




    

