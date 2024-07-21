import java.util.Scanner;

class Stack_7_7{
    int top=-1;
    char [] a;
    public Stack_7_7(int n){
        
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

    char peep(int index){
        if(top==-1 || top<index){
            System.out.println("underflow");
            return 'z';
        }
        return a[top-index];
    }

    void change(char change_value,int index){
        if(top<index || top<0){
            System.out.println("underflow");
            return;
        }

        a[top-index] = change_value;
    }
}

public class Lab7_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter string in lower case");
        String s = sc.nextLine();

        char [] c = s.toCharArray();

        String s2 = "";

        Stack_7_7 s1 = new Stack_7_7(s.length());

        for(int i=0;i<c.length;i++){

            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='u' || c[i]=='u'){

                
                for(int j=0;j<s1.top+1;j++){
                    c[j] = s1.peep(j);
                }
                for(int j=0;j<s1.top+1;j++){
                    s1.change(c[j], s1.top-j);
                }
                
                s1.push(s.charAt(i));
            }
            else{
                s1.push(c[i]);
            }
        }

        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        

        
        System.out.println("your new String  "+s);
        
    }
}
