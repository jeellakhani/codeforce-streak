import java.util.*;
public class BRoundDownThePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int temp = n;
            int count=-1;
            while(temp!=0){
                temp/=10;
                count++;
            }
            int ans= n - (int) Math.pow(10,count);
            System.out.println(ans);
        }
        sc.close();
    }
}