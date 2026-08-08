import java.util.*;
public class APangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (sc.hasNext()) {
            String str = sc.next().toLowerCase();
            HashSet<Character> uniqueLetters = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                uniqueLetters.add(str.charAt(i));
            }
            if (uniqueLetters.size() == 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
