import java.util.*;
public class AIsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> uniqueColors = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            uniqueColors.add(scanner.nextInt());
        }
        int horseshoesToBuy = 4 - uniqueColors.size();
        System.out.println(horseshoesToBuy);
        scanner.close();
    }
}