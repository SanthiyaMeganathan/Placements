import java.util.Scanner;

public class CharecterHash {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  the string that contains only smaller case letters");
        String str = input.next();
        System.out.println(str);

        int length_str = str.length();

        char[] str_chr = new char[length_str];

        int[] hash_arr = new int[26];

        System.out.println(hash_arr[25]);

        for (int i = 0; i < 26; i++) {
            hash_arr[i] = 0;

        }

        for (int i = 0; i < length_str; i++) {

            hash_arr[str_chr[i] - 'a']++;

        }
        
        

        

        
    }
    
}
