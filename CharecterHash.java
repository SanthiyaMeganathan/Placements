import java.util.Scanner;

public class CharecterHash {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string that contains only lowercase letters:");
        String str = input.next();
        System.out.println("Input string: " + str);

        int length_str = str.length();

        // Initialize the hash array for character frequency
        int[] hash_arr = new int[26];

        // Populate the hash array
        for (int i = 0; i < length_str; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                hash_arr[ch - 'a']++;
            } else {
                System.out.println("Invalid input: String contains non-lowercase letters.");
                return;
            }
        }

        // Print the frequencies
        for (int i = 0; i < 26; i++) {
            if (hash_arr[i] > 0) {
                System.out.println("Frequency of character '" + (char) (i + 'a') + "': " + hash_arr[i]);
            }
        }
    }
}
