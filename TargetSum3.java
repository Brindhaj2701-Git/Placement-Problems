import java.util.Arrays;

public class TargetSum3 {
     public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        TargetSum3 ts = new TargetSum3();
        int arr[] = {1, 2, 3, 4, 5};
        int target = 9;
        boolean result = ts.hasTripletSum(arr, target);
        System.out.println(result);
    }
}
