import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();

        int [] a = new int[n];

        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]");
            a[i] = sc.nextInt();
        }

        int pos = 0;

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.err.println();

        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                if(pos==i){
                    pos++;
                    continue;
                }
                a[pos] = a[i];
                pos++;
                a[i] = 0;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.err.println();
    }
}
