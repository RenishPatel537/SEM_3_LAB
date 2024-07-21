import java.util.Scanner;

class Stack_7_4{
    int top=-1;
    char [] a;
    public Stack_7_4(int n){
        
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
}
public class Lab7_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your string");
        String s = sc.nextLine();

        Stack_7_4 s1 =  new Stack_7_4(s.length());

        // System.out.println("(:"+(int)('('));
        // System.out.println("):"+(int)(')'));
        // System.out.println("{:"+(int)('{'));
        // System.out.println("}:"+(int)('}'));
        // System.out.println("[:"+(int)('['));
        // System.out.println("]:"+(int)(']'));

        //s1.push(s.charAt(0));

        if(s.charAt(0)==')'  || s.charAt(0)=='}' || s.charAt(0)==']' ){
            System.out.println("not valid pattern");
            return;
        }

         s1.push(s.charAt(0));

        // s1.push('(');
        // s1.push('{');
        // s1.push('}');
        // s1.push(')');

        // System.out.println(s1.peep(0));

        // if((int)s1.peep(1)==125){
        //     System.out.println("true");
        // }

        for(int i=1;i<s.length();i++){
            if(s1.top==-1){
                s1.push(s.charAt(i));
                continue;
            }
            if((int)(s.charAt(i))==40 || (int)(s.charAt(i))==123 || (int)(s.charAt(i))==91){
                s1.push(s.charAt(i));
            }
            else if((int)(s.charAt(i))==(int)(s1.peep(0))+2 || (int)(s.charAt(i))==(int)(s1.peep(0))+1){
                s1.push(s.charAt(i));
                s1.pop();
                s1.pop();
            }
            else{
                System.out.println("pattern not follow");
                return;
            }
        }

        System.out.println("pattern follow");
    }
}
