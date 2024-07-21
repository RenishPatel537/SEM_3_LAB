import java.util.Scanner;
// INSERT ELEMENT IN ASSENDING ORDER
public class Lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element");
        int ele = sc.nextInt();

        int [] a = {10,20,30,50};
        int [] temp = new int[a.length+1];

        for(int i=0;i<temp.length;i++){
            if(ele<a[i]){
                temp[i] = ele;
                for(int j=i;j<a.length;j++){
                    temp[j+1] = a[j];
                }
                break;
            }
            else{
                temp[i] = a[i];
            } 
        }
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }


    }
}
