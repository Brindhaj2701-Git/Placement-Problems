public class GCD {
    static void NumGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        NumGCD(20,28);
    }
}
