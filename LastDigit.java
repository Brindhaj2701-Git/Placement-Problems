public class LastDigit {
    public int getLastDigit(String a, String b) {

        // If exponent is 0, answer is 1
        if (b.equals("0")) {
            return 1;
        }

        // Last digit of a
        int base = a.charAt(a.length() - 1) - '0';

        // Last digit depends on exponent cycle
        int exp = 0;

        for (int i = 0; i < b.length(); i++) {
            exp = (exp * 10 + (b.charAt(i) - '0')) % 4;
        }

        if (exp == 0) {
            exp = 4;
        }

        int result = 1;

        for (int i = 0; i < exp; i++) {
            result = (result * base) % 10;
        }

        return result;
    }

    public static void main(String[] args) {
        LastDigit lastDigit = new LastDigit();
        System.out.println(lastDigit.getLastDigit("2", "3")); // 8
        System.out.println(lastDigit.getLastDigit("7", "2")); // 9
        System.out.println(lastDigit.getLastDigit("12", "0")); // 1
        System.out.println(lastDigit.getLastDigit("123456789", "987654321")); // 9
    }
}
