public class IntersectionArray {
     public static int intersectSize(int a[], int b[]) {
        // Your code here
        
        int count = 0;
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {4, 5, 6, 7, 8};
        System.out.println(intersectSize(a, b));
    }
}
