import java.util.*;
public class CProfessorGukizSRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int dis1=Math.abs(x2-x1);
        int dis2=Math.abs(y2-y1);
        int ans=Math.max(dis1,dis2);
        System.out.println(ans);
        sc.close();
    }
}