import java.util.Scanner;

public class Lab5_3of2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("enter size of arrray of string");
        int n= sc.nextInt();

        String[] a = new String[n];

        for(int i=0;i<a.length;i++){
            System.out.println("enter a["+i+"]");
            a[i] = sc.next();
        }
        int p = (int)((n-1)*Math.random());

        System.out.println(p);
        StringBuffer sb = new StringBuffer(a[p]);

        String s1 = new String();
        System.out.println("enter your string to anagram");
        s1 = sc.next();

        StringBuffer sb1 = new StringBuffer(s1);

        if(sb.length()==sb1.length()){
            for(int i=0;i<sb.length();i++){
               if((sb+"").contains(sb1.charAt(i)+"")){
                int k = sb1.indexOf(sb1.charAt(i)+"");
                sb.delete(k, k+1);
               }
               else{
                System.out.println("not anagram");
                return;
               }
            }
        }
        else{
            System.out.println("not anagram");
            return;
        }

        System.out.println(s1+"is the is a analog of "+a[p]);

    }    
}
