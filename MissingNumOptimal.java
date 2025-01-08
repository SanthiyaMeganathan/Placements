
public class MissingNumOptimal {

    public static void main(String[] args) {
    
        int n = 5;
        int[] arr = { 1, 2, 4, 5 };

        int sum = (n * (n + 1)) / 2;
        
        System.out.println("sum"+sum);

        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];

        }

        System.out.println("s"+s);
        
        int missing = sum - s;

        System.out.println(missing);
}

    
}
