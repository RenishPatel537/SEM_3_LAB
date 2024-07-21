import java.util.*;
public class Lab3_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("enter size of array");
        n = sc.nextInt();
        int []a = new int[n];

        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]");
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]"+"="+a[i]);

        }
    }
}