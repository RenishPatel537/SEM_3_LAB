import java.util.Scanner;
// replce element 
public class Lab3_6 {
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

        int m;
        System.out.println("enter first no");
        m = sc.nextInt();

        int p;
        System.out.println("enter no for replce");
        p = sc.nextInt();

        for(int i=0;i<a.length;i++){
            if(a[i]==m){
                a[i] = p;
                System.out.println("replceable element index is"+i);
            }
        }

        for(int i=0;i<a.length;i++){
            System.err.println("a["+i+"]="+a[i]);
        }
    }
}
