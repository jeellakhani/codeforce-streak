import java.util.Scanner;
public class AWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) return;
        String word = scanner.next();
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else {
                lowercaseCount++;
            }
        }
        if (uppercaseCount > lowercaseCount) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
        scanner.close();
    }
}
