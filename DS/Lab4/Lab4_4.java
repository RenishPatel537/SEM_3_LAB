import java.util.Scanner;
// DELET ELEMENT IN ASSENDING ORDER
public class Lab4_4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter element to delet");
        int ele = sc.nextInt();

        int [] a = {10,20,30,50};
        int [] temp = new int[a.length-1];
        int count = 0;
        for(int i=0;i<temp.length;i++){
            if(a[i]==ele){
                count++;
                continue;
            }

            else if(count==0){
                temp[i] = a[i];
            }
            
            else if(count!=0){
                temp[i-1] = a[i];
            }
        }

        temp[a.length-2] = a[a.length-1];

        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }




    }
}
