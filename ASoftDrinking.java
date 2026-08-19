import java.util.*;

public class ASoftDrinking {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int friend=sc.nextInt();
        int bottles=sc.nextInt();
        int liters=sc.nextInt();
        int limes=sc.nextInt();
        int slices=sc.nextInt();
        int salt=sc.nextInt();
        int neededLiters=sc.nextInt();
        int neededSalt=sc.nextInt();
        int toast1=bottles*liters/neededLiters;
        int toast2=limes*slices;
        int toast3=salt/neededSalt;
        int min1=Math.min(toast1,toast2);
        int min=Math.min(toast3,min1);
        System.out.print(min/friend);
    }
}