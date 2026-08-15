import java.util.*;

public class AGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n];
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
            a[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && h[i] == a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}