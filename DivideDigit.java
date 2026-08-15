class DivideDigit { 
 
 public int divisibleByDigits(String s) {

        char[] ch = s.toCharArray();
        int count = 0;

        // Find remainder of the number for digits 1 to 9
        int[] rem = new int[10];

        for (int i = 0; i < s.length(); i++) {

            int digit = ch[i] - '0';

            for (int d = 1; d <= 9; d++) {
                rem[d] = (rem[d] * 10 + digit) % d;
            }
        }

        // Check every digit occurrence
        for (int i = 0; i < s.length(); i++) {

            int digit = ch[i] - '0';

            if (digit != 0 && rem[digit] == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        DivideDigit obj = new DivideDigit();
        System.out.println(obj.divisibleByDigits("123")); // Output: 2
        System.out.println(obj.divisibleByDigits("12")); // Output: 2
        System.out.println(obj.divisibleByDigits("1122324")); // Output: 7
        System.out.println(obj.divisibleByDigits("27")); // Output: 0

    }
}