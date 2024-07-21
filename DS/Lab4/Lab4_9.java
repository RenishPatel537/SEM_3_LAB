import java.util.Scanner;

public class Lab4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();
        int [] a = new int[n];

        int [] b = new int[n];

        for(int i=0;i<a.length;i++){
            System.out.println("entera["+i+"]");
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            b[i] = a[a.length-1-i];
        }

        //System.out.println("hi"+(3^3));

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();

        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
