import java.util.Scanner;
class Stack{
    Scanner sc = new Scanner(System.in);
    int top=-1;
    int [] a;
    public Stack(int n){
        
        a = new int[n];
    }

    void push(int data){
        if(top==a.length-1){
            System.out.println("overflow");
            return;
        }
        top++;
        a[top] = data;
        //display();
    }

    int pop(){
        if(top==-1){
            System.out.println("under flow");
            return -1;
        }
        int x = a[top];
        top--;
        return x;
    }

    void display(){
        if(top==-1){
            System.out.println("underflow");
            return;
        }
        int top2 = top;
        for(int i=top2;i>=0;i--){
            System.out.println("element at a["+top2+"]="+a[top2]);
            top2--;
        }
    }

    int peep(int index){
        if(top==-1 || top<index){
            System.out.println("underflow");
            return -1;
        }
        return a[top-index];
    }

    void change(int change_value,int index){
        if(top<index || top<0){
            System.out.println("underflow");
            return;
        }

        a[top-index] = change_value;
        //display();
    }
}
public class Lab7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[4][2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i][0];
            int min2 = a[i][1];
            int minindex = i;

            for (int j = i + 1; j < a.length; j++) {
                if (min > a[j][0]) {
                    min = a[j][0];
                    min2 = a[j][1];
                    minindex = j;
                } else if (a[j][0] == min) {
                    if (min2 > a[i][1]) {
                        min = a[j][0];
                        min2 = a[j][1];
                        minindex = j;
                    }
                }

            }

            if (minindex != i) {
                a[minindex][0] = a[i][0];
                a[minindex][1] = a[i][1];
                a[i][0] = min;
                a[i][1] = min2;
            }

        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("enter your stack size");
        int n = sc.nextInt();
        Stack s = new Stack(n);

        s.push(a[0][0]);
        s.push(a[0][1]);

        for(int i=1;i<a.length;i++){
            for(int j=0;j<a[i].length;j=j+2){
            if(s.peep(0)>a[i][j] && a[i][j]>s.peep(1) && s.peep(0)>a[i][j+1] && a[i][j+1]>s.peep(1)){
            }
            else if(s.peep(0)>a[i][j] && a[i][j]>s.peep(1) && s.peep(0)<a[i][j+1] && a[i][j+1]>s.peep(1)){
                s.change(a[i][j+1], 0);
            }
            else{
                s.push(a[i][j]);
                s.push(a[i][j+1]);
            }
            }
        }

        s.display();
    }

}
