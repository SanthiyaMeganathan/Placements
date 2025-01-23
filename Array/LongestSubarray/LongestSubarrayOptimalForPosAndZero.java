import java.util.Scanner;


public class LongestSubarrayOptimalForPosAndZero {

    //this is only for positive and zero
    //the earlier code is the optimal if the array contains the neg 

    public static void main(String[] args) {

        System.out.println("Enter the number of elements in array:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the desired sum  of the array");

        int d = input.nextInt();

        int right = 0;
        int left = 0;
        int sum = 0;
        int maxlength = 0;

        while (right < n) {

            sum = sum + arr[right];

            System.out.println("right" + right);

            while (sum > d && left <= right) {
                sum = sum - arr[left];
                left++;
            }
            if (sum == d) {
                //here we move the pointer right after calculating the 
                maxlength = Math.max(maxlength, right - left + 1);

            }

            right++;

        }

        System.out.println("the max is : " + maxlength);

    }

    /**
     * Let's walk through your LongestSubarrayTwoPointer program step by step, with the input array [1, 2, 3] and the desired sum d = 3.

Input:
Array: [1, 2, 3]
Desired sum: 3
Initialization:
n = 3 (size of the array)
arr = [1, 2, 3]
d = 3 (desired sum of the subarray)
left = 0, right = 0 (two pointers starting at the beginning)
sum = 0 (initial sum of the subarray)
maxlength = 0 (the length of the longest subarray found with sum equal to d)
Step-by-Step Execution:
Iteration 1:
Initial state:
css
Copy
Edit
left = 0, right = 0, sum = 0, maxlength = 0
Action: Add arr[right] (i.e., arr[0] = 1) to sum:
bash
Copy
Edit
sum = sum + arr[0] = 0 + 1 = 1
Condition check: sum < d, so we do not shrink the window.
Move right to 1 (next element).
Iteration 2:
State after moving right to 1:
css
Copy
Edit
left = 0, right = 1, sum = 1, maxlength = 0
Action: Add arr[right] (i.e., arr[1] = 2) to sum:
bash
Copy
Edit
sum = sum + arr[1] = 1 + 2 = 3
Condition check: sum == d. This means we found a subarray with sum equal to d. Update maxlength:
sql
Copy
Edit
maxlength = Math.max(maxlength, right - left + 1) = Math.max(0, 1 - 0 + 1) = 2
Move right to 2 (next element).
Iteration 3:
State after moving right to 2:
css
Copy
Edit
left = 0, right = 2, sum = 3, maxlength = 2
Action: Add arr[right] (i.e., arr[2] = 3) to sum:
bash
Copy
Edit
sum = sum + arr[2] = 3 + 3 = 6
Condition check: sum > d. Since sum exceeds the desired sum, we shrink the window by moving left:
Move left to 1 (shrink window):
bash
Copy
Edit
sum = sum - arr[left] = 6 - arr[0] = 6 - 1 = 5
Move left to 2 (shrink window again):
bash
Copy
Edit
sum = sum - arr[left] = 5 - arr[1] = 5 - 2 = 3
Condition check: sum == d. Now, we found another subarray with sum equal to d. Update maxlength:
sql
Copy
Edit
maxlength = Math.max(maxlength, right - left + 1) = Math.max(2, 2 - 2 + 1) = 1
Move right to 3 (end of the array).
Final Output:
At the end of the loop, we have maxlength = 2, which is the length of the longest subarray with sum equal to 3.
Special Case for Index n-1:
If we consider the 3 at n-1 (index 2), it would contribute to a subarray [3], which also has a sum of 3. However, its length is 1 and is shorter than the length of the subarray [1, 2] found earlier. Hence, the final result remains 2.

Final Length Calculation:
The longest subarray found is [1, 2] with a sum of 3, and its length is 2.
Output:
python
Copy
Edit
Maximum length of subarray with sum 3 is: 2








     */
    
}
