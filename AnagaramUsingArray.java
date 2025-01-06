import java.util.Scanner;

public class AnagaramUsingArray {
    public static void main(String[] args) {

        int[] alaphabets = new int[26];

        System.out.println(alaphabets);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String name1 = input.next();
        System.out.println("Enter second string");
        String name2 = input.next();

        for (int i = 0; i <= name1.length()-1; i++) {
            alaphabets[name1.charAt(i) - 'a']++;

        }
        for (int i = 0; i <= name2.length()-1; i++) {
            alaphabets[name2.charAt(i) - 'a']--;

        }
        for (int i = 0; i <= 25; i++) {
            if (alaphabets[i] != 0) {
                System.out.println("Strings are not anagrams");
                return;
            }

        }

        System.out.println("anagram");
    }
                                           
    
}
