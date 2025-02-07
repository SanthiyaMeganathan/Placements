import java.util.Scanner;

//stockbuy and sell

public class BuyAndSell {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of days ");
        int n = input.nextInt();
        Buyandsell(n);

    }
    
    static void Buyandsell(int n) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of eachday: ");
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = input.nextInt();

        }

        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        int currentProfit = 0;
        int max_price = 0;
        
        for (int i = 0; i < n; i++) {

            if (price[i] < min_price) {
                min_price = price[i];
            }

            currentProfit = price[i] - min_price;

          



            if (max_profit < currentProfit) {
                max_profit = currentProfit;
                max_price = max_profit + min_price;
            }

        }
        
        System.out.println("The minimum price that we bought: " + min_price);
        System.out.println("The profit that we got: " + max_profit);
         System.out.println("The price we sell: "+max_price);
        
    }
}
