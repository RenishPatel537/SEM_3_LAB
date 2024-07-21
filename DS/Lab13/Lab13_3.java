class A13_3 extends DoublyLL{
    public void deleteAtlternateNode(){
         DNode temp = head;
         while (temp.linkR!=null) {
            temp.linkR = temp.linkR.linkR;
            if(temp.linkR==null){
                tail = temp;
                return;
            }
            temp.linkR.linkL = temp;
            temp = temp.linkR;        
         }
    }
} 

public class Lab13_3 {
    public static void main(String[] args) {
        A13_3 dll = new A13_3();

        dll.insertAtFirst(8);
        dll.insertAtFirst(7);
        dll.insertAtFirst(6);
        dll.insertAtFirst(5);
        dll.insertAtFirst(4);
        dll.insertAtFirst(3);
        dll.insertAtFirst(2);
        dll.insertAtFirst(1);

        dll.deleteAtlternateNode();

        dll.display();
    }
}

