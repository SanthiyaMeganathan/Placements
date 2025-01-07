import java.util.Scanner;

public class UnionOfArrayOptimal {

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array1");
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        System.out.println("Enter the Size of Array2");

        int n2 = input.nextInt();

        int[] arr1 = new int[n1];

        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of array1");

        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();

        }
        System.out.println("Enter the elements of array2");
        
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        int i = 0;
        int j = 0;
        int[] union = new int[n1+n2];
        int k=0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if(k ==0 || union[k-1] != arr1[i]){
                    union[k]=arr1[i];
                    k++;

                }
                i++;
                
            } else {
                if (k == 0 || union[k - 1] != arr2[j]) {
                    union[k] = arr2[j];
                    k++;

                }
                j++;

            }
            


        }
        
        while (i < n1) {
            if(k ==0 || union[k-1] != arr1[i]){
                    union[k]=arr1[i];
                    k++;

                }
                i++;

        }
        
        while (j < n2) {
            if (k== 0 || union[k - 1] != arr2[j]) {
                union[k] = arr2[j];
                k++;

            }
            j++;

        }

        for (int s = 0; s < k; s++) {
            System.out.print(union[s] + " ");
        }
        

        


    }
    
}
