public class Lab12_7 {
    public static void main(String[] args) {
        ListDemo12_1 sList = new ListDemo12_1();

        sList.addNode(1);    
        sList.addNode(1);    
        sList.addNode(6);    
        sList.addNode(13);
        sList.addNode(13);
        sList.addNode(27);
        sList.addNode(27);

        sList.display();

        sList.deleteDublicateFromSorted();

        sList.display();
    }
}
