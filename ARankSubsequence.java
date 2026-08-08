import java.util.*;
public class ARankSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] l = new int[n];
            int[] r = new int[n];
            int[] u = new int[n];
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = sc.nextInt();
                r[i] = sc.nextInt();
                u[i] = sc.nextInt();
                v[i] = sc.nextInt();
            }
            int ans = 0;
            for (int m = n; m >= 1; m--) {
                int originalIdx = 0;
                int matched = 0;
                for (int j = 1; j <= m; j++) {
                    while (originalIdx < n) {
                        int leftRank = j;
                        int rightRank = m - j + 1;
                        boolean ok = (leftRank < l[originalIdx] || leftRank > r[originalIdx]) &&
                                     (rightRank < u[originalIdx] || rightRank > v[originalIdx]);
                        
                        originalIdx++;
                        if (ok) {
                            matched++;
                            break;
                        }
                    }
                }
                if (matched == m) {
                    ans = m;
                    break; 
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}