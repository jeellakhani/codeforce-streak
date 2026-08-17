import java.util.*;
public class APoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int officer = 0;
        int uc = 0;
        
        for (int i = 0; i < n; i++) {
            int event = scanner.nextInt();
            
            if (event == -1) {
                if (officer > 0) {
                    officer--;
                } else {
                    uc++;
                }
            } else {
                officer += event;
            }
        }
        System.out.println(uc);
        scanner.close();
    }
}
