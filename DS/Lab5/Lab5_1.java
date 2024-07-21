import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("enter your a[" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
                System.out.println("enter your b[" + i + "][" + j + "]");
                b[i][j] = sc.nextInt();

                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

}
