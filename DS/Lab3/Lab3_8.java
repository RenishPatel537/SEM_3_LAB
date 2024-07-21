import java.util.Scanner;
// NAME IN ASSENDING ORDER
public class Lab3_8{
    public static void main(String[] args) {
        String []a = new String[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<a.length;i++){
            System.out.println("enter your"+(i+1)+"student");
            a[i] = sc.nextLine();
        }

        for(int i=0;i<a.length;i++){
            String min = a[i];
            int minindex = i;
            for(int j=i+1;j<a.length;j++){
               if(min.compareToIgnoreCase(a[j])>0){
                min = a[j];
                minindex = j;
               }
            }
            if(minindex!=i){
                a[minindex] = a[i];
                a[i] = min;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.println((i+1)+":"+a[i]);
        }

    }
}