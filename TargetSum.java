import java.util.Scanner;

public class TargetSum {
    public int[] FindInex(int arr[],int target){
        int n = arr.length;

        int i,j;
        for(i=0;i<n;i++){
            for( j=i+1;j<n;j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum");
        int target = sc.nextInt();

        TargetSum ts = new TargetSum();
        int result[] = ts.FindInex(arr,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
