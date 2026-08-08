import java.util.Scanner;
public class AThresholdMovement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int minOdd = Integer.MAX_VALUE;
            int maxEven = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int weight = sc.nextInt();
                if (i % 2 == 0) {
                    minOdd = Math.min(minOdd, weight);
                } else {
                    maxEven = Math.max(maxEven, weight);
                }
            }
            if (n % 2 != 0) {
                System.out.println("NO");
            } else if (minOdd - maxEven >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
