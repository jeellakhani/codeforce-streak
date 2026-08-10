import java.util.*;
public class AAntonAndLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashSet<Character> distinctLetters = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                distinctLetters.add(ch);
            }
        }
        System.out.println(distinctLetters.size());
        scanner.close();
    }
}