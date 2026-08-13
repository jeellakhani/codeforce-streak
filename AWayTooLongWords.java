import java.util.*;
public class AWayTooLongWords {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            int len = word.length();
            if (len > 10) {
                System.out.println("" + word.charAt(0) + (len - 2) + word.charAt(len - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}