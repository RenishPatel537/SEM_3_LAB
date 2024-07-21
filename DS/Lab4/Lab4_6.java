import java.util.Scanner;
// MERGE TWO UNSORTED ARRAY
public class Lab4_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of first array");
        int n = sc.nextInt();

        System.out.println("enter size of  2nd array");
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            System.out.println("enter a[" + i + "]");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("enter b[" + i + "]");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            if (i <= a.length - 1) {
                c[i] = a[i];
            } else {
                c[i] = b[i-(a.length)];
            }
        }
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }
}
