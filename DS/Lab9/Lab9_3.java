class DoubleEndedQueue{
    int [] a;
    int front;
    int rare;
    public DoubleEndedQueue(int size){
        a = new int[size];
        this.rare = -1;
        this.front = -1;
    }

    public void insertAtFirst(int data){
        if(rare==-1){
            front = 0;
            rare = 0;
            a[rare] = data;
        }
        else{
            System.out.println("overflow for front");
            return;
        }
    }

    public void insertAtLast(int data){
        if(rare==a.length-1){
            System.out.println("overflow");
            return;
        }
        if(front==-1){
            front = 0;
            rare = 0;
            a[rare] = data;
        }
        else{
            rare++;
            a[rare] = data;
        }
    }

    public int deleteAtFirst(){
        int data;
        if(front==-1){
            System.out.println("underflow");
            return 0;
        }
        else if (front==rare) {
            data = a[front];
            front = -1;
            rare = -1;
            return data;
        }
        else{
            data = a[front];
            front++;
            return data;
        }
    }

    public int deleteAtLast(){
        int data;
        if(front==-1){
            System.out.println("underflow");
            return 0;
        }
        else if(rare==front){
            data = a[rare];
            front = -1;
            rare = -1;
            return data;
        }
        else{
            data = a[rare];
            rare--;
            return data;
        }
    }

    public void display(){
        if(front==-1){
            System.out.println("queue is empty");
            return;
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

public class Lab9_3 {
    public static void main(String[] args) {
        DoubleEndedQueue dq = new DoubleEndedQueue(3);

        dq.insertAtFirst(1);
        //dq.insertAtFirst(2);
        dq.insertAtLast(2);
        dq.insertAtLast(3);
        dq.deleteAtLast();
        dq.deleteAtLast();
        dq.deleteAtLast();
        dq.display();
    }
}
