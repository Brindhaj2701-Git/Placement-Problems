public class Search {
    public static int SearchElement(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {12,15,27,3,327};
        int target = 327;

        int result = SearchElement(arr, target);
        System.out.println("Element found at index : " + result);
    }
}
