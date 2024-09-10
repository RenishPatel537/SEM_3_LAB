// insertion sort
import java.util.Scanner;

public class Lab19_2 {
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
            int temp = a[i];
            if(a[i-1]<=a[i]){
                continue;
            }
            else{
                for(int j=i-1;j>=0;j--){
                    if(temp<a[j]){
                        a[j+1] = a[j];
                        a[j] = temp;
                    }
                    else{
                        break;
                    }
                    // else{
                    //     a[j+1] = temp;
                    // }
                }
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }
}
