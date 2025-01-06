import java.util.HashMap;
import java.util.Scanner;


public class Anagram {

    public static void main(String[] args) {
        //comparing 2 string.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String name1 = input.next();
        System.out.println("Enter second string");
        String name2 = input.next();

        /*
         * Hashmap
         * map
         * for 
         * array sort
         * 
         */
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();


        for (char ch1 : name1.toCharArray()) {
            if (map1.containsKey(ch1)) {
                map1.put(ch1, map1.get(ch1) + 1);

            } else {
                map1.put(ch1, 1);

            }
        } 
        for (char ch2 : name2.toCharArray()) {
            if (map2.containsKey(ch2)) {
                map2.put(ch2, map2.get(ch2) + 1);

            } else {
                map2.put(ch2, 1);

            }
        }
        
        if ((map1.toString()).equals((map2.toString()))) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }


        
    }
    
}
