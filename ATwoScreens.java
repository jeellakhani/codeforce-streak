import java.util.*;

public class ATwoScreens {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n!=0){
            String s=sc.nextLine();
            String t=sc.nextLine();
            int common=0;
            int min_len=Math.min(s.length(),t.length());
            while(common<min_len && s.charAt(common)==t.charAt(common)){
                common++;
            }
            int ans=s.length()+t.length()-common;
            if(common>0) ans+=1;
            System.out.println(ans);
            n--;
        }
    }
}