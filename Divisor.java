import java.util.Scanner;

public class Divisor {
    public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a number to find its divisors: ");
        int n = scanner.nextInt();
        printDivisors(n);
    }
}
