import java.util.*;

public class ATheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[3];
        x[0] = scanner.nextInt();
        x[1] = scanner.nextInt();
        x[2] = scanner.nextInt();
        Arrays.sort(x);
        int minDistance = x[2] - x[0];
        System.out.println(minDistance);
        scanner.close();
    }
}