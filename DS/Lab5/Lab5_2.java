import java.util.Scanner;

public class Lab5_2 {

    public static void main(String[] args) {
        int [][] a = new int[3][2];
        int [][] b = new int[2][3];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println("enter your element a["+i+"]["+j+"]");
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.println("enter your element b["+i+"]["+j+"]");
                b[i][j] = sc.nextInt();
            }
        }

        int sum=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[1].length;j++){
                for(int k=0;k<b.length;k++){
                    sum = sum+a[i][k]*b[k][j];
                }
                System.out.print(sum+"  ");
                sum=0;
            }
            System.out.println();
        }
    }
}