import java.util.*;

public class C_3{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your n : ");
        int n = sc.nextInt();

        int ans=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                ans=j+ans;
            }
        }

        System.out.println(ans);
        
    }
}   