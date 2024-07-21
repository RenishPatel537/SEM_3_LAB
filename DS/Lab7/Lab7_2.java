import java.util.Scanner;

class Stack_7_2{
    int top=-1;
    char [] a;
    public Stack_7_2(int n){
        
        a = new char[n];
    }

    void push(char data){
        if(top==a.length-1){
            System.out.println("overflow");
            return;
        }
        top++;
        a[top] = data;
    }

    char pop(){
        if(top==-1){
            System.out.println("under flow");
            return 'z';
        }
        char x = a[top];
        top--;
        return x;
    }
}

public class Lab7_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //System.out.println("enter size of array");
       // int n = sc.nextInt();
       // Stack_7_2 s = new Stack_7_2(n);

        System.out.println("enter string for grammer check");
        String s1 = sc.nextLine();
        int index = s1.indexOf('c');
        Stack_7_2 s = new Stack_7_2(index);

        boolean is = true;

        
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!='c'){
                    s.push(s1.charAt(i));
                }
                else if(s1.charAt(i)=='c'){
                    break;
                }
            }

             

            s1 = s1.substring(index+1);
           // System.out.println(s1);

            if(s1.length()==s.top+1){
                for(int i=0;i<s1.length();i++){
                    if(s1.charAt(i)==s.pop()){

                    }
                    else{
                        System.out.println("not follow grammer");
                        return;
                    }
                }
            }
            else{
                System.out.println("not same");
                return;
            }

            System.out.println("your string follow the grammer");
    }
}
