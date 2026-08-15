import java.util.*;

public class AAmusingJoke {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String guest = sc.next();
            String host = sc.next();
            String pile = sc.next();
            String combinedNames = guest + host;
            if (combinedNames.length() != pile.length()) {
                System.out.println("NO");
                return;
            }
            char[] names = combinedNames.toCharArray();
            char[] piles = pile.toCharArray();
            Arrays.sort(names);
            Arrays.sort(piles);
            if (Arrays.equals(names, piles)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}