import java.util.Scanner;
// duplicacy check not remove
public class Lab3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("enter size of array");
        n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("enter a[" + i + "]");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                // if(i==j){
                // continue;
                // }
                if (a[i] == a[j]) {
                    System.out.println("duplicate is avilable");
                    return;
                }

            }
        }
        System.out.println("duplicate is not avilable");
    }

}
