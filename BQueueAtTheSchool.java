import java.util.Scanner;
public class BQueueAtTheSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String initialQueue = scanner.next();
        char[] queue = initialQueue.toCharArray();
        for (int second = 0; second < t; second++) {
            for (int i = 0; i < n - 1; i++) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    i++;
                }
            }
        }
        System.out.println(new String(queue));
        scanner.close();
    }
}