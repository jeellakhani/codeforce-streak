import java.util.*;

public class ASumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> answers = new ArrayList<>();
            int factor = 1;
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    answers.add(digit * factor);
                }
                n /= 10;
                factor *= 10;
            }
            System.out.println(answers.size());
            for (int i = 0; i < answers.size(); i++) {
                System.out.print(answers.get(i) + (i == answers.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}