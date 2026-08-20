import java.util.*;

public class AILoveUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int firstScore = scanner.nextInt();
        int maxScore = firstScore;
        int minScore = firstScore;
        int amazingCount = 0;
        for (int i = 1; i < n; i++) {
            int currentScore = scanner.nextInt();
            if (currentScore > maxScore) {
                maxScore = currentScore;
                amazingCount++;
            } else if (currentScore < minScore) {
                minScore = currentScore;
                amazingCount++;
            }
        }
        System.out.println(amazingCount);
        scanner.close();
    }
}