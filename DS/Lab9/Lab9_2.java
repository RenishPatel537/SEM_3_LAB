import java.util.Scanner;

class CircularQueue{
    int [] a;
    int front=-1;
    int rare=-1;
    public CircularQueue(int size){
        a = new int[size];
    }

    public void enqueue(int data){
        if(front==-1 && rare==-1){
            front = 0;
            rare = 0;
            a[rare] = data;
            return;
        }
        if(rare==a.length-1){
            rare=0;
            if(rare==front){
                System.out.println("queue overflow");
                rare = a.length-1;
                return;
            }
            a[rare] = data;
        }
        else{
            if(rare+1==front){
                System.out.println("overflow");
                return;
            }
            rare++;
            a[rare] = data;
        }
    }

    public int dequeue(){
        int data;
        if(front==-1){
            System.out.println("underflow");
            return 0;
        }
        if(front==rare){
            data = a[front];
            rare=-1;
            front = -1;
            return data;
        }
        else if(front==a.length-1){
            data = a[front];
            front = 0;
            return data;
        }
        else{
            data = a[front];
            front = front+1;
            return data;
        }
    }

    public void display(){
        if(front==-1){
            System.out.println("queue is empty");
            return;
        }
        int temp = front;

        while (temp!=rare) {
            System.out.print(a[temp]+" ");
            if(temp==a.length-1){
                temp = 0;
                continue;
            }
            temp++;
        }
        System.out.print(a[temp]+" ");
        System.out.println();
    }
}

public class Lab9_2{
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("for enqueue:add, for dequeue:delete, for diplay:diplay, for exit:exit");
        System.out.println("commond:");
        String commond = "";

        while (!commond.equals("exit")) {
            System.out.print("commond:");
            commond = sc.nextLine();
            if(commond.equals("add")){
                System.out.print("enter a data:");
                int data = sc.nextInt();
                q.enqueue(data);
            }
            else if(commond.equals("delete")){
                q.dequeue();
            }
            else if (commond.equals("diplay")) {
                q.display();
            }
            else if (!commond.equals("exit")) {
                System.out.println("enter valid command:");
            }
        }

        // q.enqueue(1);
        // q.enqueue(2);
        // q.enqueue(3);
        // q.enqueue(4);
        // q.enqueue(5);
        // q.display();
        // q.dequeue();
        // q.dequeue();
        // q.enqueue(6);
        // q.enqueue(7);
        // q.dequeue();
        // q.dequeue();

        // q.display();
    }
}