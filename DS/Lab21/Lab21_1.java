// merge sort
import java.util.Scanner;

public class Lab21_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int [] a = new int[n];

        System.out.println("enter element of arry");

        for(int i=0;i<a.length;i++){
            System.out.print("enter a["+i+"]");
            a[i] = sc.nextInt();
        }

        System.out.println("-------unsorted array-----------");

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        mergesort(a, 0, n-1);
        System.out.println("---------sorted array---------");

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void mergesort(int[] a,int left,int right){
        if(left>=right) return;

        int mid = (left+right)/2;

        mergesort(a, left,mid);
        mergesort(a,mid+1,right);

        merge(a,left,right,mid);
    }

    public static void merge(int a[],int left,int right,int mid){
        int n1 = mid - left+1;
        int n2 = right -mid;

        int la[] = new int[n1];
        int ra[] = new int[n2];

        for(int i=0;i<n1;i++){
            la[i] = a[left+i];
        }

        for(int i=0;i<n2;i++){
            ra[i] = a[mid+i+1];
        }

        int i=0,j=0;
        int k = left;

        while (i<n1 && j<n2) {
            if(la[i]<ra[j]){
                a[k] = la[i];
                i++;
            }
            else{
                a[k] = ra[j];
                j++;
            }
            k++;
        }

        while (i<n1) {
            a[k] = la[i];
            i++;
            k++;
        }

        while (j<n2) {
            a[k] = ra[j];
            j++;
            k++;
        }
    }
}