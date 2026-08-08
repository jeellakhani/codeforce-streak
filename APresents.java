import java.util.*;
public class APresents {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] giver = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int target = scanner.nextInt();
            giver[target] = i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(giver[i] + (i == n ? "" : " "));
        }
        
        scanner.close();
    }
}