import java.util.*;
public class CDistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < n; i++) {
                int ch = s.charAt(i) - 'a';
                if (arr2[ch] == 0)
                    count2++;
                arr2[ch]++;
            }
            int max = 0;
            for (int i = 0; i < n - 1; i++) {
                int ch = s.charAt(i) - 'a';
                arr2[ch]--;
                if (arr2[ch] == 0)
                    count2--;
                if (arr1[ch] == 0)
                    count1++;
                arr1[ch]++;
                max = Math.max(max, count1 + count2);
            }
            System.out.println(max);
        }
        sc.close();
    }
}