import java.util.Scanner;
// DELET DUPLICATE ELEMENT 
public class Lab4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] a = new int[n];
        

        for (int i = 0; i < a.length; i++) {
            System.out.println("enter a[" + i + "]");
            a[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }

        //System.out.println(count);

        int[] temp = new int[a.length - count];

        temp[0] = a[0];
        count = 1;
        boolean t = false;
        int k = 1;
        for (int i = 1; i < temp.length; i++) {

            for (int j = 0; j < count; j++) {

                if (a[i] == temp[j]) {
                    t = true;
                    j = count;
                }
            }

            if (t == false) {
                temp[k] = a[i];
                count++;
                k++;
            }
            t = false;
        }
        System.out.println();

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }

       

    }
}
