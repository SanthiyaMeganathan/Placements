import java.util.Scanner;

public class Array012better {

    public static void main(String[] args) {

        System.out.println("Enter the numbe rof elements in array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        System.out.println("The elements should be 0, 1, 2");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        //sorting

        System.out.println("The array before sorting");

        for (int i = 0; i < n; i++) {
            System.err.println(arr[i]);
        }

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        

        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;

        while (count0 > 0) {
            arr[index] = 0;
            index++;
            count0--;
            
           

        }
        while (count1 > 0) {
            arr[index] = 1;
            index++;
            count1--;
            
        }
        while (count2 > 0) {
            arr[index] = 2;
            index++;
            count2--;

          
      
        }

        System.out.println("Array after sorting");
        
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }




    }
    

}
