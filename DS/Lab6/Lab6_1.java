import java.util.Scanner;

public class Lab6_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no a");
        int a = sc.nextInt();

        System.out.println("enter no. b");
        int b = sc.nextInt();

        swap(a,b);

    }

    static void swap(int a,int b){
        int temp = a;
        System.out.println("Before a:"+a+"b:"+b);
        a = b;
        b = temp;
        System.out.println("after a:"+a+"b:"+b);
    }
}