import java.util.Scanner;
import java.util.Stack;

public class PostfixShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter stirng");
        String s = sc.nextLine();

        findPrefix(s);
    }

    public static void findPrefix(String s1) {

        int rank = 0;
        String postfix = "";
        Stack<Character> s2 = new Stack<>();
        s2.push('(');

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '+' || s1.charAt(i) == '-' || s1.charAt(i) == '*' || s1.charAt(i) == '/') {
                rank = rank - 1;
                if (rank < 0) {
                    System.out.println("not valid expresion");
                    return;
                }
                while (true) {
                    if (s2.peek() == '(') {
                        s2.push(s1.charAt(i));
                        break;
                    } else if (g(s2.peek()) >= g(s1.charAt(i))) {
                        postfix = postfix + s2.pop();
                    } else {
                        s2.push(s1.charAt(i));
                        break;
                    }
                }
            } else if (s1.charAt(i) == '^') {
                rank = rank - 1;
                if (rank < 0) {
                    System.out.println("not valid expresion");
                    return;
                }
                while (true) {
                    if (s2.peek() == '(') {
                        s2.push(s1.charAt(i));
                        break;
                    } else if (!s2.isEmpty() && g(s2.peek()) > g(s1.charAt(i))) {

                        postfix = postfix + s2.pop();
                    } else {
                        s2.push(s1.charAt(i));
                        break;
                    }
                }
            } else if (s1.charAt(i) == ')') {
                while (true) {
                    if (!s2.isEmpty() && s2.peek() != '(') {
                        postfix = postfix + s2.pop();
                    } else {

                        s2.pop();
                        break;
                    }
                }
            } else if (s1.charAt(i) == '(') {
                s2.push(s1.charAt(i));
            } else {
                rank = rank + 1;
                postfix = postfix + s1.charAt(i);
            }
        }
            System.out.println("postfix:"+postfix);    
    }

    public static int g(char x) {
        if (x == '+' || x == '-') {
            return 1;
        } else if (x == '*' || x == '/') {
            return 2;
        } else if (x == '^') {
            return 3;
        } else if (x == '(') {
            return 8;
        } else {
            return -1;
        }
    }
}
