public class Rotate1Array{
    public void rotate(int[] arr) {
        // code here
        
        int n = arr.length;
        int temp = arr[n-1];
        
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        
        arr[0] = temp;
    }

    public static void main(String[] args) {
        Rotate1Array ra = new Rotate1Array();
        int arr[] = {1, 2, 3, 4, 5};
        ra.rotate(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}