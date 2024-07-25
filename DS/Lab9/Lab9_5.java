import java.util.*;

class Feather{
    String [] a;
    int front = -1;
    int rare = -1;
    public Feather(int size){
        a = new String[size];
    }


    public void buy(String buy){
        String [] s = buy.split("buy");
        if(front==-1 && rare==-1){
            front = 0;
            rare = 0;
            a[rare] = s[1];
            return;
        }
        if(rare==a.length-1){
            rare=0;
            if(rare==front){
                System.out.println("queue overflow");
                rare = a.length-1;
                return;
            }
            a[rare] = s[1];
        }
        else{
            if(rare+1==front){
                System.out.println("overflow");
                return;
            }
            rare++;
            a[rare] = s[1];
        }
    }

    public String fetch(){
        String s = "";

        if(front==-1){
            System.out.println("underflow");
            return "";
        }
        else{
            int temp = front;
            s = a[front];
            while (temp!=rare) {
                a[temp] = a[temp+1];
                temp++;
            }
            a[temp] = s;
            return s;
        }
    }

    public void display(){
        if(front==-1){
            System.out.println("empty");
        }
        else{
            int temp = front;
            while (temp!=rare) {
                System.out.print(a[temp]+" ");
                temp++;
            }
            System.out.print(a[temp]+" ");
            System.out.println();
        }
    }
}

public class Lab9_5 {
    public static void main(String[] args) {
        Feather f = new Feather(3);

        f.buy("buyred");
        f.buy("buygreen");
        f.buy("buyyellow");

        f.fetch();

        f.display();

    }
}
