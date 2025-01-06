
import java.util.HashMap;

public class CountCharecterOccurence {

    public static void main(String[] args) {
        String name = "malayalam";
        
        HashMap<Character, Integer> map = new HashMap<>();
        [m]

        for (char ch : name.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);

            } else {
                map.put(ch, 1);
            }
        }
        
        System.out.println(map);




    }
    
}
