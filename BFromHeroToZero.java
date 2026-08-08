import java.util.*;
public class BFromHeroToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long count = 0;
            while (n > 0) {
                if (n % k == 0) {
                    n /= k;
                    count++;
                } else {
                    long rem = n % k;
                    n -= rem;
                    count += rem;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}