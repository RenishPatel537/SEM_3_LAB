import java.util.Scanner;
// INSERT ELEMENT AT GIVEN INDEX
public class Lab4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter element");
        int ele = sc.nextInt();

        System.out.println("enter locatin");
        int idx = sc.nextInt();

        int [] a = {10,220,30,40};
        int [] temp = new int[a.length+1];

        for(int i=0;i<temp.length;i++){
            if(idx==i){
                temp[i] = ele;
            }

            else if(idx>i){
                temp[i] = a[i];
            }

            else if(idx<i){
                temp[i] = a[i-1];
            }
        }

        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}