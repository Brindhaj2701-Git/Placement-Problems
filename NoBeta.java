import java.util.*;

public class NoBeta {

    static boolean noBeta(int num){
        String s = String.valueOf(num);

        for(int i=1;i<s.length();i++){
            int a = s.charAt(i - 1) - '0';
            int b = s.charAt(i) - '0';

            if(Math.abs(a-b) != 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = 0;

        for(int i=l;i<=r;i++){
            if(noBeta(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
