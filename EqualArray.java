import java.util.Arrays;

public class EqualArray {
    public static boolean isEqual(int arr1[],int arr2[]){
        if(arr1.length != arr2.length){
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {5,4,3,2,1};

        boolean result = isEqual(arr1, arr2);
        System.out.println("Are the two arrays equal? : " + result);
    }
}
