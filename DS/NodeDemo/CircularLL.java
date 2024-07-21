public class CircularLL{
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
