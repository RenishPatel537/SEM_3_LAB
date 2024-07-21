import java.util.Scanner;

public class Lab3_3 {
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
        System.out.println("enter first m no to find avg");
        m = sc.nextInt();

        int sum=0;
        for(int i=0;i<m;i++){
           sum = sum+a[i];
        }
        System.out.println("avg is "+sum/m);

    }
}
