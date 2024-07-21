import java.util.Scanner;

class ListDemo12_1{
Node head = null;
Node tail = null;

    //addNode() will add a new node to the list    
    public void addNode(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.link = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }
    
    public void copy(ListDemo12_1 l){
        //Node temp = head;
        Node temp1 = l.head;
       
        
            while (temp1!=null){
                if(head==null){
                    Node new_node = new Node(temp1.data);
                    head = new_node;
                    tail = new_node;
                    temp1 = temp1.link;
                }
                else{
                Node new_node = new Node(temp1.data);
                tail.link = new_node;
                tail = new_node;
                temp1 = temp1.link;
                }
            }
            // Node new_node = new Node(temp1.data);
            // tail.link = new_node;
            // tail = new_node;
            //System.out.println(temp1);
    }

    public void reverse() {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head.link;
        Node temp2 = temp.link;

            temp.link = head;
            head.link = null;
            head = temp;
            temp = temp2;
            temp2 = temp2.link;

        while (temp2!=null) {
            temp.link = head;
            //head.link = temp;
            head = temp;
            temp = temp2;
            temp2 = temp2.link;
        }

        temp.link = head;
        head = temp;
        //System.out.println(head.data+""+head.link);
    }


    public void sort(){
        Node temp = head;
        Node temp2 = temp.link;

        while (temp.link!=null) {
            int min = temp.data;
            Node minindex = temp;
            while (temp2!=null) {
                if(temp2.data<temp.data){
                    min = temp2.data;
                    minindex = temp2;
                }
                temp2 = temp2.link;
            }
            if(minindex!=temp){
                minindex.data = temp.data;
                temp.data = min;
            }
            temp = temp.link;
            temp2 = temp.link;
        }
    }

    public void swapKthAtEndKth(int index){
        int count=1;
        //int index1 = index;
        //int index2 = countOfNode()-index+1;
        Node temp = head;
        Node first=null;
        Node second=null;
        //System.out.println(countOfNode());

        //jo ekaj node hoy to link list ma
        if(index==(countOfNode()-index+1)){
            return;
        }
        while (temp!=null) {
            if(index==count){
                first = temp;
                //System.out.println("count"+count);
            }
            else if(count==(countOfNode()-index+1)){
                second = temp;
                break;
            }
            temp = temp.link;
            count++;
            //System.out.println("count"+count);
        }

        count = second.data;
        second.data = first.data;
        first.data = count; 
    }

    public void swapCorresponding(){
        Node temp1 = head;
        Node temp2 = head.link;
        Node temp3 = null;
        head = head.link;
        while (true) {
            if(temp2.link==null){
                temp2.link = temp1;
                temp1.link = null;
                return;
            }
            temp3 = temp2.link;
            temp2.link = temp1;
            temp2 = temp3;

            temp1.link = temp2.link;
            temp2 = temp2.link;
            temp1 = temp3;
        }
    }


    //display() will display all the nodes present in the list    
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.link;    
        }    
        System.out.println();    
    }

    public int countOfNode(){
        int count=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.link;
            count++;
        }
        return count;
    }

}

class Node{
 int data;
 Node link;

 public Node(int data){
    this.data = data;
    this.link = null;
 }
}

public class Lab12_1 {
    public static void main(String[] args) {
        ListDemo12_1 sList = new ListDemo12_1();
        ListDemo12_1 sList2 = new ListDemo12_1();    
            
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);
        
        sList.reverse();

        sList2.addNode(5);
        sList2.addNode(6);

        //sList2.copy(sList);
       // sList2.display();
        
        
        //sList.SameOrNot(sList2);
        //System.out.println(sList.countOfNode());
        //sList.deleteWithData(3);
       // sList.delete(1);
        //Displays the nodes present in the list    
        sList.display();    
    }
}
