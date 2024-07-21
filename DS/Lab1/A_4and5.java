import java.util.*;

public class A_4and5{
    
    static int fec(int f){
        
        if(f == 0 || f == 1){
            
            return f*1;
        }
        else{
            
            return f*fec(f-1);
        }
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your No. : ");
        int f = sc.nextInt();
        int ans = fec(f);
        // int ans = 1;

        // for(int i = 1; i <= f; i++){
        //     ans *= i;
        // }

         System.out.println("Factorial Of "+f+" Is "+ans);
    }
}