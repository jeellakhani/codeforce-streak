import java.util.Scanner;
    public class AInSearchOfAnEasyProblem {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int numberOfPeople = scanner.nextInt();
        boolean isHard = false;
        for (int i = 0; i < numberOfPeople; i++) {
            int opinion = scanner.nextInt();
            if (opinion == 1) {
                isHard = true;
                break;
            }
        }
        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
        scanner.close();
    }
}