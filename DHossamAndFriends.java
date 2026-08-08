import java.util.*;
public class DHossamAndFriends{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<ArrayList<Integer>> bad = new ArrayList<>(n + 1);
            for (int i = 0; i <= n; i++) {
                bad.add(new ArrayList<>());
            }
            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x > y) {
                    int temp = x;
                    x = y;
                    y = temp;
                }
                bad.get(y).add(x);
            }
            int l = 1;
            long ans = 0;
            for (int r = 1; r <= n; r++) {
                for (int x : bad.get(r)) {
                    l = Math.max(l, x + 1);
                }
                ans += (r - l + 1);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
