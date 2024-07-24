public class Lab13_4 {
    public static void main(String[] args) {
        
        CircularLL cl = new CircularLL();
        cl.insertNodeAtLast(1);
        cl.insertNodeAtLast(2);
        cl.insertNodeAtLast(3);
        cl.insertNodeAtLast(4);
        cl.insertNodeAtLast(5);
        cl.insertNodeAtLast(6);
        //System.out.println("count"+cl.countNode());
        //System.out.println("hi");
        cl.display();
        //System.out.println("hi");
        CircularLL cl2 = new CircularLL();
        cl2 = cl.splitInTOHalves();
        cl.display();
        //System.out.println("hi");
        cl2.display();
    }
}
