import java.util.*;

public class ABuyAShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        for (int shovels = 1; shovels <= 10; shovels++) {
            int totalCost = shovels * k;
            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                System.out.println(shovels);
                break; 
            }
        }
        scanner.close();
    }
}