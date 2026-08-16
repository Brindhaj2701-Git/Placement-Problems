import java.util.Scanner;

public class PerfectNumber {
    public boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    
    public static void main(String[] args) {
        PerfectNumber obj = new PerfectNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a perfect number: ");
        int n = scanner.nextInt();
        boolean result = obj.isPerfect(n);
        System.out.println("Is " + n + " a perfect number? " + result);
    }
}
