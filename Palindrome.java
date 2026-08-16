import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(n != 0){
            rev = rev * 10 + (n%10);
            n = n/10;
        }
        if(rev == temp){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a palindrome: ");
        int n = scanner.nextInt();
        boolean result = isPalindrome(n);
        System.out.println("Is " + n + " a palindrome? " + result);
    }
}

