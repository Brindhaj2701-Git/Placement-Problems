public class Missing {
    public static int MissNum(int arr[]){
        int n = arr.length + 1;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        int total = (n*(n+1))/2;

        return total - sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8};
        int result = MissNum(arr);
        System.out.println("Missing number is : " + result);
    }
}
