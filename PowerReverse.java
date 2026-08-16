public class PowerReverse {
     public int reverseExponentiation(int n) {
        // code here
        int temp = n;
        int rev = 0;
        while(n != 0){
            rev = rev * 10 + (n%10);
            n = n/10;
        }
        long pow = 1;
        for(int i=0;i<rev;i++){
            pow = pow * temp;
        }

        return (int)pow;
    }

    public static void main(String[] args) {
        PowerReverse obj = new PowerReverse();
        System.out.println(obj.reverseExponentiation(2)); // Output: 4
        System.out.println(obj.reverseExponentiation(10)); // Output: 10
        System.out.println(obj.reverseExponentiation(3)); // Output: 27
        System.out.println(obj.reverseExponentiation(5)); // Output: 3125
    }
}
