import java.util.Scanner;

public class MaxPSubArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int maxSum = arr[0];
        int minSum = arr[0];
        int result = arr[0];

        for(int i=1;i<n;i++){

            if(arr[i] < 0){
                int temp = maxSum;
                maxSum = minSum;
                minSum = temp;
            }
            
            maxSum = Math.max(arr[i], maxSum * arr[i]);
            minSum = Math.min(arr[i], minSum * arr[i]);
            result = Math.max(result, maxSum);
        }

        System.out.println("The maximum product of the subarray is: " + result);


    }
}
