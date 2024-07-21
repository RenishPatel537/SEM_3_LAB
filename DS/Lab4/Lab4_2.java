import java.util.Scanner;
// DELET ELEMENT FROM GIVEN LOCATION
public class Lab4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter location of delet element");
        int index = sc.nextInt();

        int [] a = {1,2,3,4,5};

        int [] temp = new int[a.length-1];

        for(int i=0;i<temp.length;i++){
            if(i==index){
                continue;
            }
            else if(index>i){
                temp[i]=a[i];
            }

            else if(index<i){
                temp[i-1]=a[i];
            }
        }

        temp[a.length-2]=a[a.length-1];

        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }

    }
}
