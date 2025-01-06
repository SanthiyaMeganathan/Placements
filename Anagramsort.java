import java.util.Arrays;
import java.util.Scanner;


public class Anagramsort {   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String name1 = input.next();
        System.out.println("Enter second string");
        String name2 = input.next();

        char[] name1_array = name1.toCharArray();
        char[] name2_array = name2.toCharArray();
        
        Arrays.sort(name2_array);
        Arrays.sort(name1_array);

        System.out.println(name1_array);
        System.out.println(name2_array);
        

            for (int i = 0; i <= name1.length() - 1; i++) {
                if (name1_array[i] != name2_array[i]) {
                    System.out.println("Not Anagrams");
                    return;
                }
              
            
        }
         
        System.out.println("Anagarm");
    }
}
