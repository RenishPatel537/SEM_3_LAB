import java.util.Scanner;
import java.util.Stack;

public class Lab8_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter stirng");
        String s = sc.nextLine();

        findPostFix(s);
    }

    public static void findPostFix(String infix){
        String polish = "";
        int rank=0;

        Stack<Character> s1 = new Stack<>();

        s1.push('(');

        infix = infix+")";

        for(int i=0;i<infix.length();i++){
            if(s1.isEmpty()){
                System.err.println("invalid");
                return;
            }

            char next = infix.charAt(i);
            while (g(s1.peek()) > f(next)) {
                polish += s1.pop();
            }
            rank+= r(next);
                if(rank<0){
                    
                    System.err.println("invaild :hws");

                }

            if(g(s1.peek()) != f(next)){
                s1.push(next);
            }
            else{
                s1.pop();
            }


        }
        System.err.println("polish notation:"+polish);
    }

    public static int r(char x){
        if(x=='+' || x=='-' || x=='*' || x=='/' || x=='^'){
            return -1;
        }
        else if(x=='(' || x==')') return 0;

        return 1;
    }

    public static int g(char x){
        if(x=='+' || x=='-'){
            return 2;
        }
        else if(x=='*' || x=='/'){
            return 4;
        }
        else if(x=='^'){
            return 5;
        }
        else if(x=='('){
            return 0;
        }
        else{
            return 8;
        }
    }

    public static int f(char x){
        if(x=='+' || x=='-'){
            return 1;
        }
        else if(x=='*' || x=='/'){
            return 3;
        }
        else if(x=='^'){
            return 6;
        }
        else if(x=='('){
            return 9;
        }
        else if(x==')'){
            return 0;
        }
        else{
            return 7;
        }
    }
}
