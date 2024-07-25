import java.util.Scanner;

class Queue{
    int [] a;
    int front=-1;
    int rare=-1;
    public Queue(int size){
        a = new int[size];
    }

    public void enqueue(int data){
        if(front==-1 && rare==-1){
            front = 0;
            rare = 0;
            a[rare] = data;
            return;
        }
        else if(rare==a.length-1){
            System.out.println("overflow");
            return;
        }
        else{
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
        else if(front==rare){
            data = a[front];
            rare=-1;
            front = -1;
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
            temp++;
        }
        System.out.print(a[temp]+" ");
        System.out.println();
    }
}

public class Lab9_1{
    public static void main(String[] args) {
        Queue q = new Queue(3);

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
                sc.nextLine();
                q.enqueue(data);
            }
            else if(commond.equals("delete")){
                q.dequeue();
            }
            else if (commond.equals("display")) {
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