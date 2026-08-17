public class ThirdMax {
    public static int MaxThree(int arr[]){
        if(arr.length < 3){
            return -1;
        }

        int first = 0;
        int second = 0;
        int third = 0;

        for(int i=0;i<arr.length;i++){

            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }

            else if(arr[i] > second){
                third = second;
                second = arr[i];
            }

            else if(arr[i] > third){
                third = arr[i];
            }
        }

        return third;
    }

    public static void main(String[] args) {
        int arr[] = {1,12,15,27,327};
        int result = MaxThree(arr);
        System.out.println("Max of Three : " + result);
    }
}
