class DNode{
    int data;
    DNode linkL;
    DNode linkR;
    public DNode(int data){
        this.data = data;
        linkL = null;
        linkR = null;
    }
}

class DoublyLL{
    DNode head = null;
    DNode tail = null;

    public void insertAtFirst(int data){
        DNode  new_node = new DNode(data);
        if(head==null){
            head = new_node;
            tail = new_node;
        }
        else{
            new_node.linkL = null;
            head.linkL = new_node;
            new_node.linkR = head;
            head = new_node;
        }
    }

    public void insertNodeAtLast(int data){
        DNode new_node = new DNode(data);
        if(head==null){
            head = new_node;
            tail = new_node;
        }
        else{
            new_node.linkR = null;
            new_node.linkL = tail;
            tail.linkR = new_node;
            tail = new_node;
        }
    }

    public void deleteNodeFromSpecificPosition(int index){
        int c=1;
        DNode temp = head;

        if(index==0){
            head = head.linkR;
            head.linkL = null;
            return;
        }

        while (c!=index) {
            temp = temp.linkR;
            if(temp==null){
                System.out.println("index out of bound");
                return;
            }
            c++;
        }

        if(temp.linkR.linkR==null){
            temp.linkR = null;
            tail = temp;
            return;
        }
        temp.linkR = temp.linkR.linkR;
        temp.linkR.linkL=temp;
    }

    public void display(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        DNode temp = head;
        System.out.println("list of doubly link list");
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.linkR;
        }
        System.out.println();
    }
}

public class Lab13_2 {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.insertAtFirst(4);
        dll.insertAtFirst(3);
        dll.insertAtFirst(2);
        dll.insertAtFirst(1);

        dll.deleteNodeFromSpecificPosition(5);

        dll.display();
    }   
}
