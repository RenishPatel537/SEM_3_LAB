import java.util.Scanner;

class ListDemoOf11_3{
    Node head = null;
    Node tail = null;

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.link = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            newNode.link = head;
            head = newNode;

        }
    }

    // display() will display all the nodes present in the list
    public void display() {
        // Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.link;
        }
        System.out.println();
    }

    public void duplicate(){
        Node temp = head;
        Node temp2 = temp;
        Node temp3 = temp.link;
        //boolean is = true;
       
        while(temp.link!=null){
            while (temp3!=null) {
                if(temp3.data==temp.data){
                    temp2.link = temp3.link;
                    temp3 = temp3.link;
                }
                else{
                    temp2 = temp2.link;
                    temp3 = temp3.link;
                }
            }
            temp = temp.link;
            //System.out.println(temp);
            temp2 = temp;
            if(temp==null){
                return;
            }
            temp3 = temp.link;
        }
    }

}

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class Lab11_3 {
    public static void main(String[] args) {
        ListDemoOf11_3 sList = new ListDemoOf11_3();
        ListDemoOf11_3 sList2 = new ListDemoOf11_3();

        // Add nodes to the list
        sList.addNode(5);
        sList.addNode(4);
        sList.addNode(3);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(2);
        sList.addNode(5);
        sList.duplicate();

        // sList2.addNode(1);
        // sList2.addNode(2);
        // sList2.addNode(3);
        // sList2.addNode(4);
        // sList.deleteWithData(3);
        // sList.delete(1);
        // Displays the nodes present in the list
        sList.display();
    }
}
