import java.util.Scanner;
public class AMagnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();
        int groups = 1;
        String prev = scanner.next();
        for (int i = 1; i < n; i++) {
            String curr = scanner.next();
            if (!curr.equals(prev)) {
                groups++;
            }
            prev = curr;
        }
        System.out.println(groups);
        scanner.close();
    }
}