import java.util.*;
public class AArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int[] a = new int[n];
        int maxVal = 0, minVal = 101;
        int maxIdx = 0, minIdx = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > maxVal) {
                maxVal = a[i];
                maxIdx = i;
            }
            if (a[i] <= minVal) {
                minVal = a[i];
                minIdx = i;
            }
        }
        int result = maxIdx + (n - 1 - minIdx);
        if (maxIdx > minIdx) {
            result--;
        }
        System.out.println(result);

    }
}