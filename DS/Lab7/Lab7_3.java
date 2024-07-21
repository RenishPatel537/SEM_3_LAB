import java.util.Scanner;

class Stack_7_3{
    int top=-1;
    char [] a;
    public Stack_7_3(int n){
        
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
public class Lab7_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter your string");
        String s = sc.nextLine();


        Stack_7_3 s1 = new Stack_7_3(s.length());

        for(int i=0;i<s.length();i++){
            s1.push(s.charAt(i));
        }

        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<s1.top+1;i++){
            if(s1.pop() == 'a'){
                
                count1 = count1+1;
            }

            if(s1.pop() == 'b'){
                if(count1>1){
                    System.out.println("not follow pattern");
                    return;
                }
                count2=count2+1;
            }
        }

        System.out.println(count1+count2);
        System.out.println(count1);
        System.out.println(count2);

        if(count1 == count2){
            System.out.println("pattern followed");
        }
        else{
            System.out.println("pattern not followed");
        }
    }
}
