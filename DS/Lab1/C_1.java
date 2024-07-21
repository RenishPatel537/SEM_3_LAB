import java.util.*;
//right
public class C_1{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Second : ");
        int sec = sc.nextInt();

        int h , m;

        h = (sec/3600);

        m = ((sec%3600)/60);

        sec = (sec - (h*3600 + m*60));

        System.out.println(h+":"+m+":"+sec);
        
    }
}   