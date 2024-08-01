import java.util.Scanner;

public class Lab18_1{
    public static void main(String[] args) {
        int [] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]");
            a[i] = sc.nextInt();
        }

        System.out.println("enter value to find in array");
        int n = sc.nextInt();

        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                System.out.println("your element at "+i);
                return;
            }
        }

        System.out.println("your element not exist in array");
    }
}