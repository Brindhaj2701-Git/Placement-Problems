public class ReverseNum {
    public int reverseDigits(int n) {
        // Code here
        int rev = 0;
        while(n != 0){
            rev = rev * 10 + (n%10);
            n = n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseNum obj = new ReverseNum();
        System.out.println(obj.reverseDigits(123)); // Output: 321
        System.out.println(obj.reverseDigits(4567)); // Output: 7654
        System.out.println(obj.reverseDigits(890)); // Output: 98
        System.out.println(obj.reverseDigits(1001)); // Output: 1001
    }
}
