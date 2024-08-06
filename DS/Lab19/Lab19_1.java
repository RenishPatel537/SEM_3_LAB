import java.util.Scanner;

public class  Lab19_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int [] a = new int[n];

        for(int i=0;i<a.length;i++){
            System.out.print("enter value of a["+i+"]");
            a[i] = sc.nextInt();
            System.out.println();
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for(int i=1;i<a.length;i++){
            int flag =0;
            int temp;
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    temp =a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}