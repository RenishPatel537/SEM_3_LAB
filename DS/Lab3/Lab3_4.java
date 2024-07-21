import java.util.Scanner;

public class Lab3_4 {
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

        int p1 = 0;

        int p2 = 0;

        int max = a[0];
        int min = a[0];

        for(int i =1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
                p1 = i;
            }

            if(a[i]<min){
                min = a[i];
                p2 = i;
            }
        }

        System.out.println("max no and index is "+max+"&"+p1);
        System.out.println("min no and index is "+min+"&"+p2);


    }
}
