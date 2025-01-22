

public class MissingNum {

    //brute
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5 };
        int n = 5;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                int flag = 0;
                if (arr[j] == i) {
                    flag = 1;
                    i++;
                } else {
                    System.out.println(i);
                }
        }
      }

       
    }
    
}
