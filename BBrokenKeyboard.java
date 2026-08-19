import java.util.*;
public class BBrokenKeyboard {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n!=0){
            String s=sc.nextLine();
            boolean[] working = new boolean[26];
            int i = 0;
            while (i < s.length()) {
                char ch = s.charAt(i);
                int count = 0;
                while (i < s.length() && s.charAt(i) == ch) {
                    count++;
                    i++;
                }
                if (count % 2 != 0) {
                    working[ch - 'a'] = true;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                if (working[j]) {
                    sb.append((char) ('a' + j));
                }
            }
            System.out.println(sb.toString());
            n--;
        }
    }
}