import java.util.*;

public class Encryption{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to encrypt: ");
        String str = sc.next();

        System.out.print("Enter a key for encryption (integer): ");
        int k = sc.nextInt();

        StringBuilder res = new StringBuilder();

        for(char ch : str.toCharArray()){
            char enc = (char) ((ch - 'a' + k) % 26 + 'a');
            res.append(enc);
        }

        System.out.println("Encrypted string: " + res.toString());
    }

}