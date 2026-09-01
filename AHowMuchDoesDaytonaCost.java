import java.util.*;
public class AHowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                boolean exists = false;
                for (int i = 0; i < n; i++) {
                    int num = sc.nextInt();
                    if (num == k) {
                        exists = true;
                    }
                }
                if (exists) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}