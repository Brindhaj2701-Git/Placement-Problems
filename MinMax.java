public class MinMax {
    public static int[] MiniMaxi(int arr[]){
        int min = arr[0];
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        return new int[] {min,max};
    }

    public static void main(String[] args) {
        int arr[] = {327,450,999,1530,1212};
        int result[] = MiniMaxi(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
}
