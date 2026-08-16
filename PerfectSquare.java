import java.lang.Math;
import java.util.Scanner;

public class PerfectSquare {
    public int square(int n){
        int result = (int) Math.sqrt(n);

        return result;
    }

    public static void main(String[] args) {
        PerfectSquare ps = new PerfectSquare();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its square root: ");
        int n = scanner.nextInt();
        int result = ps.square(n);
        System.out.println("The square root of " + n + " is: " + result);
    }
}
