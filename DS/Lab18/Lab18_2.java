import java.util.Scanner;

public class Lab18_2{
    public static void main(String[] args) {
        int [] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]");
            a[i] = sc.nextInt();
        }

        System.out.println("enter value to find in array");
        int n = sc.nextInt();

        int mid = (a.length-0)/2;
        int start = 0;
        int end = a.length-1;

        while(start<=end){
           if(a[mid]==n){
            System.out.println("your element find at "+mid);
            return;
           }
           else if (a[mid]>n) {
            start = start;
            end = mid-1;
           }
           else if (a[mid]<n) {
            start = mid+1;
            end = end;
           }
           mid = (start+end)/2;
        }

        System.out.println("your element not exist in array");
    }
}