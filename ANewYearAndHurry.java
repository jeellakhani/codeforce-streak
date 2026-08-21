import java.util.*;

public class ANewYearAndHurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int availableTime = 240 - k;
        int problemsSolved = 0;
        int timeSpent = 0;
        for (int i = 1; i <= n; i++) {
            int timeForCurrentProblem = 5 * i;
            if (timeSpent + timeForCurrentProblem <= availableTime) {
                timeSpent += timeForCurrentProblem;
                problemsSolved++;
            } else {
                break; 
            }
        }
        System.out.println(problemsSolved);
        
        scanner.close();
    }
}