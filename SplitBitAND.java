import java.util.*;

public class SplitBitAND {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int k = sc.nextInt();

        int epl = str.length() / k;
        int res = -1;

        for(int i=0;i<k;i++){
            String part = str.substring(i*epl,(i+1)*epl);
            int value = Integer.parseInt(part,2);

            if(i==0){
                res = value;
            }
            else{
                res = res & value;
            }


        }
        System.out.println(res);
    }

            
}
