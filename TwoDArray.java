import java.util.Scanner;


class TwoDArray {
    public static void main(String[] args) {

        System.out.println("Enter the Size of the Array: ");
        Scanner input = new Scanner(System.in);
        int rowsize = input.nextInt();
        System.out.println("Enter the Colum size");
        int col_size = input.nextInt();

        int[][] two_d_arr = new int[rowsize][col_size];
        System.out.println("Enter the elemenets of the array");

    

        for (int i = 0; i < two_d_arr.length; i++) {
            for (int j = 0; j < two_d_arr[i].length; j++) {
                two_d_arr[i][j] = input.nextInt();

                

            }
          
        }
        
        for (int i=0; i < two_d_arr.length; i++) {
            for (int j = 0; j < two_d_arr[i].length; j++) {
                System.out.print(two_d_arr[i][j] + " ");
            }
            System.out.println();
        }
      
            
            
        }
                
    }

