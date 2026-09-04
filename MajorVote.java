import java.util.*;

public class MajorVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char res = 'Z';
        int maxc = 0;

        for(char ch : map.keySet()){
            int curc = map.get(ch);
            if(curc > maxc || (curc == maxc && ch < res)){
                maxc = curc;
                res = ch;
            }
        }

        System.out.println("Majority element is : " + res);

    }
    
}
