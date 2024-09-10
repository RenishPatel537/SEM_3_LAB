// inssertion sort
import java.util.*;

public class Lab20_1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter size:");
        int n= sc.nextInt();

        int [] a = new int[n];

        for(int i=0;i<a.length;i++){
            System.out.print("enter a["+i+"]");
            a[i] = sc.nextInt();
            System.out.println();
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for(int i=0;i<a.length;i++){
            int min = a[i];
            int minindex = i;

            for(int j=i+1;j<a.length;j++){
                if(min>a[j]){
                    min = a[j];
                    minindex = j;
                }
            }

            if(minindex!=i){
                a[minindex] = a[i];
                a[i] = min;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
   
    }
}