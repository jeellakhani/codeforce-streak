import java.util.*;
public class ACandiesAndTwoSisters {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong(); 
                long ans = (n - 1) / 2;
                System.out.println(ans);
            }
        }
        sc.close();
    }
}