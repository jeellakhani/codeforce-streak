import java.util.*;

public class AABAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int tensDigit = n / 10;
            int unitsDigit = n % 10;
            int sum = tensDigit + unitsDigit;
            System.out.println(sum);
        }
        scanner.close();
    }
}