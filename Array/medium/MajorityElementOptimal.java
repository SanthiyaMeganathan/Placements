import java.util.Scanner;

public class MajorityElementOptimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = input.nextInt();
        FindMajority(n);
        input.close();


    }
    
    static void FindMajority(int n) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        //booyers moore algorithm:

        int canditate = arr[1];
        int vote = 1;

        for (int i = 1; i < n; i++) {
            if (canditate == arr[i]) {
                vote++;
            } else {
                vote--;
            }

            if (vote == 0) {
                canditate = arr[i];
                vote = 1;
            }
        }

        int count = 0;

        for (int num : arr) {
            if (num == canditate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("The majority element is " + canditate + "hence it appred for "+count+"times");
        }

        input.close();
    }
    
}
