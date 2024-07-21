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
        display();
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
        return a[top-index+1];
    }

    void change(int change_value,int index){
        if(top<index || top<0){
            System.out.println("underflow");
            return;
        }

        a[top-index] = change_value;
        display();
    }
}

public class Lab7_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        Stack s = new Stack(n);

        System.out.println("which method want you call");
        System.out.println("for push 1, for pop 2, for display 3, for peep 4, for change 5, for exit 6");

        System.out.println("enter no for call method");
        int m = sc.nextInt();

        while(m!=6){
            switch (m) {
                case 1: System.out.println("enter element to add");
                        int p = sc.nextInt();
                        s.push(p);
                    
                    break;
                case 2: System.out.println("delete element from stack");
                        int x = s.pop();
                        System.out.println(x+"is remove from stack");
                    
                    break;
                
                case 3: System.out.println("diplay all element of stack");
                        s.display();
                    
                    break;
                
                case 4: System.out.println("enter index to fatch element from specific index from stack");
                        int index = sc.nextInt();
                        int y = s.peep(index);
                        System.out.println(y+"is peep elemrt of yours");
                    
                    break;

                case 5: System.out.println("enter element and index to change in stack");
                        int change_value = sc.nextInt();
                        int index1 = sc.nextInt();
                        s.change(change_value,index1);
                    
                    break;
            
                default:
                    break;
            }
            System.out.println("enter no for call method");
            m = sc.nextInt();
        }
    }
}