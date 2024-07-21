import java.util.Scanner;

class Node{
    int data;
    Node link;

    public Node(int data){
        this.data = data;
        this.link = null;
    }
}

class CircularLL{
    Node head = null;
    Node tail = null;

    public void insertAtFirst(int data){
        Node new_node = new Node(data);
        if(head==null){
            head = new_node;
            tail = new_node;
            head.link = new_node;
        }
        else{
            new_node.link = head;
            head = new_node;
            tail.link = new_node;
        }
    }

    public void deleteNodeFromSpecificPosition(int index){
        int c = 1;
        Node temp = head;
        

        if(index==0){
            head = head.link;
            tail.link = head;
            return;
        }

        while (index!=c) {
            temp = temp.link;
            if(temp==null){
                System.out.println("indexOutOfBound");
                return;
            }
            c++;  
        }

        if(temp.link.link==head){
            tail=temp;
        }
        temp.link=temp.link.link;
    }

    public void insertNodeAtLast(int data){
        Node new_node = new Node(data);

        if(head==null){
            head = new_node;
            tail = new_node;
        }
        else{
            tail.link = new_node;
            tail = new_node;
            tail.link = head;
        }
    }

    public void display(){
        System.out.println("node of link list");
        Node temp = head;
        while (temp!=tail){
            System.out.print(temp.data+" ");
            temp = temp.link;
        }
        System.out.print(temp.data+" ");
    }
}


public class Lab13_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        CircularLL cll = new CircularLL();

        System.out.println("enter a number to call method");
        System.out.println("for insert at first:1");
        System.out.println("deleteNodeFromSpecificPosition:2");
        System.out.println("insertNodeAtLast:3");
        System.out.println("display:4");
        System.out.println("for exit:5");
        int n = sc.nextInt();

        int a;

        while (n!=5) {
            
        if(n==1){
            System.out.println("enter data value to insert");
            a = sc.nextInt();
            cll.insertAtFirst(a);
            System.out.println("enter no. to call method which you want");
            n=sc.nextInt();
        }
        else if(n==2){
            System.out.println("enter index to delete node");
            a = sc.nextInt();
            cll.deleteNodeFromSpecificPosition(a);
            System.out.println("enter no. to call method which you want");
            n=sc.nextInt();
        }
        else if(n==3){
            System.out.println("enter a data value to add node at last");
            a = sc.nextInt();
            cll.insertNodeAtLast(a);
            System.out.println("enter no. to call method which you want");
            n=sc.nextInt();
        }
        else if (n==4){
            cll.display();
            System.out.println("enter no. to call method which you want");
            n=sc.nextInt();
        }
        else if (n==5){
            break;
        }
    }



    }
}