import java.util.Scanner;
import java.util.Stack;

public class Lab8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a comma sepreted prifix string");
        String s1 = sc.nextLine();

        evalueation(s1);
    }

    public static void evalueation(String s1) {
        String[] a = s1.split(",");
        Stack<Integer> s = new Stack<>();
        char x;
        int op1;
        int op2;

        for (int i = a.length - 1; i >= 0; i--) {

            if (!(a[i].equals("+") || a[i].equals("-") || a[i].equals("*") || a[i].equals("/") || a[i].equals("^"))) {
                s.push(Integer.parseInt(a[i]));
            }
            else {
                op1 = s.pop();
                op2 = s.pop();
                if (a[i].equals("+")) {
                    op1 = op1 + op2;
                    s.push(op1);
                } else if (a[i].equals("/")) {
                    op1 = op1 / op2;
                    s.push(op1);
                } else if (a[i].equals("*")) {
                    op1 = op1 * op2;
                    s.push(op1);
                } else if (a[i].equals("-")) {
                    op1 = op1 - op2;
                    s.push(op1);
                } else if (a[i].equals("^")) {
                    op1 = (int)Math.pow(op1, op2);
                    s.push(op1);
                }
            }

        }
        System.out.println("ans:" + s.pop());
    }
}
