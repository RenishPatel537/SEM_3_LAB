import java.util.Scanner;
import java.util.Stack;

public class Lab8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter stirng");
        String s = sc.nextLine();

        findPrefix(s);
    }

    public static void findPrefix(String s){

        int rank=0;
        

        char [] a = s.toCharArray();

        s = "";

        for(int i=0;i<a.length;i++){
            if(a[i]=='('){
                a[i] = ')';
            }
            else if(a[i]==')'){
                a[i] = '(';
            }       
            s = s + a[i];
        }
        System.out.println(s+"sbefore");

        //s = s+')';


        StringBuffer s1 = new StringBuffer(s);
        s1.reverse();
        s1 = s1.append(')');
        System.out.println(s1+"s1before");

        // System.out.println(s1);
        Stack<Character> s2 = new Stack<>();
        s2.push('(');

        s = "";

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='+' || s1.charAt(i)=='-' || s1.charAt(i)=='*' || s1.charAt(i)=='/'){
                rank = rank-1;
                if(rank<0){
                    System.out.println("not valid expresion");
                    return;
                }
                while (true) {
                    if(s2.peek()=='('){
                        s2.push(s1.charAt(i));
                        break;
                    }
                    else if(g(s2.peek())>g(s1.charAt(i))){
                        s = s + s2.pop();
                    }
                    else{
                        s2.push(s1.charAt(i));
                        break;
                    }
                }
            }
            else if(s1.charAt(i)=='^'){
                rank = rank-1;
                 if(rank<0){
                    System.out.println("not valid expresion");
                    return;
                }
                while (true) {
                    if(s2.peek()=='('){
                        s2.push(s1.charAt(i));
                        break;
                    }
                    else if(!s2.isEmpty() && g(s2.peek())>=g(s1.charAt(i))){

                        s = s + s2.pop();
                    }
                    else{
                        s2.push(s1.charAt(i));
                        break;
                    }
                }
            }
            else if (s1.charAt(i)==')') {
                while (true) {
                    if(!s2.isEmpty() && s2.peek()!='('){
                        s = s + s2.pop();
                    }
                    else{
                        
                        s2.pop();
                        break;
                    }
                }
            }
            else if(s1.charAt(i)=='('){
                s2.push(s1.charAt(i));
            }
            else{
                rank = rank + 1;
                s = s + s1.charAt(i);
            }
        }

        //a = s.toCharArray();

        s1 = new StringBuffer(s);
        s1.reverse();

        System.out.println(s);
        System.out.println(s1+" prefix of infix");


    }

    public static int g(char x){
        if(x=='+' || x=='-'){
            return 1;
        }
        else if(x=='*' || x=='/'){
            return 2;
        }
        else if(x=='^'){
            return 3;
        }
        else if(x=='('){
            return 8;
        }
        else{
            return -1;
        }
    }
}
