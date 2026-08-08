import java.util.Scanner;
public class ACalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLong()) {
            scanner.close();
            return;
        }
        long n = scanner.nextLong();
        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(-(n + 1) / 2);
        }
        scanner.close();
    }
}