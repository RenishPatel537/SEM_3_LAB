import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("if you want to create obj call createOBJ method");
        boolean is;
        is = sc.nextBoolean();
        if(is==true){
            Create c = new Create();    
        }



        //Scanner sc = new Scanner(System.in);
        System.out.println("enter add node to 1");
        int n=0;
        int data;

        while (n!=3) {
            System.out.println("enter no to call method");
            n = sc.nextInt();
            if(n==1){
                System.out.println("enter data");
                data = sc.nextInt();
                cll.insertAtFirst(data);
            }else if (n==2) {
                cll.display();
            }
        }
    }
}
